#!/bin/bash

app="course-0.0.1-SNAPSHOT.jar"

port="12580"

git pull

mvn clean package -Dmaven.test.skip=true

mvn install

pid=`lsof -i:$port | tail -1 | awk '{ print $2 }'`

kill -9 $pid

nohup java -jar ./target/$app &
