#!/bin/sh

#set -e
success = $?

echo "The hadoop execution for drill data processing started at " $(date);

echo "Processing the files ";

echo "Starting the process for loading drilling file to HDFS" ;hadoop fs -rm -r -f /FilesDrillingData &&hadoop fs -put $(eval echo ~$USER)/uploads/5/ /FilesDrillingData &&echo "Data moved to hdfs. Now loading in hive" &&


hive -e "drop table if exists DataMiningDrill;drop table if exists DataMiningDrillFinal;create table DataMiningDrill(Depth double,Backforce double,Comments varchar(80)) row format delimited fields terminated by '|';create table DataMiningDrillFinal(FileName varchar(200),Depth double,Backforce double,Comments varchar(80)) row format delimited fields terminated by '|';" &&

echo "Table Created in hive. Processing further .. " &&

hive -e "load data inpath '/FilesDrillingData/*.csv' into table DataMiningDrill;" &&

hive -e "insert into table DataMiningDrillFinal select split(INPUT__FILE__NAME,'hdfs://localhost:54310/user/hive/warehouse/dataminingdrill/')[1],* from DataMiningDrill;" &&

echo "Loaded in Hive Data warehouse." &&
#Added for test only
#mysql -u root -proot -e 'use MiningProcessSchema;drop table if exists MiningDrillData;drop table if exists MiningDrillDataToExport;create table MiningDrillData (FileName varchar(200),Depth double,Backforce double,Comments varchar(80));create table MiningDrillDataToExport ( PointZ double ,PointY double , PointX double );' &&
######################

mysql -u root -proot -e 'use MiningProcessSchema;drop table if exists MiningDrillData;drop table if exists MiningDrillDataToExport;create table MiningDrillData (FileName varchar(200),Depth double,Backforce double,Comments varchar(80));create table MiningDrillDataToExport ( PointZ double ,PointY double , PointX double , Material varchar(50));' &&


echo "Table created in mysql" &&

sqoop export --bindir ./ --connect jdbc:mysql://localhost/MiningProcessSchema  --username root --password root --table MiningDrillData --export-dir /user/hive/warehouse/dataminingdrillfinal --direct --fields-terminated-by '|' &&


echo "Data Loaded in mysql.Exporting required data of Iron.." &&	

#Added for test only
#mysql -u root -proot -e "use MiningProcessSchema;insert into MiningDrillDataToExport (select d.Depth, m.PointX , m.PointY from MiningDrillData d, MiningMasterData m , BackforceAssumptioData b where m.FileName=d.FileName and d.Backforce>=b.BackforceStartValue and d.backforce<b.BackforceEndValue and b.Materail='Iron' order by d.Depth,m.PointX,m.PointY);" &&
######################

mysql -u root -proot -e "use MiningProcessSchema;insert into MiningDrillDataToExport (select d.Depth, m.PointX , m.PointY , b.Materail from MiningDrillData d, MiningMasterData m , BackforceAssumptioData b where m.FileName=d.FileName and d.Backforce>=b.BackforceStartValue and d.backforce<b.BackforceEndValue  order by d.Depth,m.PointX,m.PointY);" &&hadoop fs -rm -r -f /MiningConvertedData &&

sqoop import --bindir ./ --connect jdbc:mysql://localhost/MiningProcessSchema --username root --password root --table MiningDrillDataToExport --m 1 -target-dir /MiningConvertedData &&hadoop fs -get /MiningConvertedData $(eval echo ~$USER)/uploads/processed/

if [ "$?" = "0" ] ; then
	echo "Process success"
else 
	echo "------------!!!!!Something wrong !!Process failed!!!!------------";
fi

echo " The hadoop execution for file processing ended at " $(date) ;