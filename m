:
export SERVLET_LIB_JAR="../Dolphin/lib/servlet-api.jar"
export ECHO3_LIB_HOME=../echo3/dist/lib
ant clean
ant
cp ./dist/lib/Echo3_*.jar ../Dolphin/lib/
cp ./dist/lib/Echo3_*.jar ../echopoint/lib/
