

success = $?

echo " The hadoop execution started at " $(date) ;

echo " Processing the files ";

echo "Starting the process for mapping file to HDFS and then to mysql"

/usr/local/hadoop/bin/hadoop fs -rm -r -f /FileMappingData && 
/usr/local/hadoop/bin/hadoop fs -put $(eval echo ~$USER)/data/mappingfile/ /FileMappingData &&

mysql -u root -proot -e 'use MiningProcessSchema;drop table if exists MiningMasterData;create table MiningMasterData (PointID VARCHAR(20), PointX int, PointY int, FileName VARCHAR(80));' &&

echo "Table created in mysql" &&

sqoop export --bindir ./ --connect jdbc:mysql://localhost/MiningProcessSchema  --username root --password root --table MiningMasterData --export-dir /FileMappingData -direct &&
echo "Data Loaded in mysql.Exiting.."	


if [ "$?" = "0" ] ; then
	echo "Process success"
else 
	echo "------------!!!!!Something wrong !!Process failed!!!!------------";
fi

echo " The hadoop execution ended at " $(date) ;
