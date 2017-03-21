#What is this?
<pre>
├───data  <----------------------- this folders contains data which is or which will be used with hadoop.
│   ├───drillfiles <-------------- this contains sample of drilled files (CSV files)
│   ├───mappingfile <------------- this contains mapping file about Which CSV files belongs to which Point
│   ├───miningData 
│   │   ├───drillfiles
│   │   └───mappingfile
│   ├───processed  <--------------- After processing with hadoop, we will get abstracted data, we named it as a "Processed Data"
│   │   └───MiningConvertedData
│   └───scripts <------------------- this contains script to run hadoop automatically and also move data to hadoop to hive to mysql!
│       └───metastore_db
│           ├───log
│           ├───seg0
│           └───tmp
├───dumps
├───Libraries
│   ├───mailactivation  <----------- this contains jar for Mail activation, when user signup or wants reset password, it will send mail
│   └───recaptcha4j-0.0.7 <--------- this contains jar for recaptcha for java (Google api to reduce spam request and validate humans)
|
└───uploads <----------------------- this contains uploaded files or Images, which will be moved to Hadoop
    ├───imgs
    └───processed
</pre>


You need to download this folder structure, and use it with hadoop!
Please read instructions and Prerequisites : <a href="https://github.com/MineriaForetell/Hadoop-MineriaForetell-dependency/blob/master/data/scripts/Pre-reqisite%20before%20running%20process.pdf">
Click here (PDF)</a>
