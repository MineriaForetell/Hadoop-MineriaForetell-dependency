success = $?

echo "Starting Hadoop";

stop-all.sh &&

start-all.sh &&

echo "Hadoop Started" &&
 
jps
	
