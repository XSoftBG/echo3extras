:
export SERVLET_LIB_JAR="/usr/local/apache-tomcat-6.0.26/lib/servlet-api.jar"
export ECHO3_LIB_HOME=../echo3/dist/lib
ant
cp ./dist/lib/Echo3_*.jar ../../Dolphin/lib/
cp ./dist/lib/Echo3_*.jar ../echopoint/lib/
