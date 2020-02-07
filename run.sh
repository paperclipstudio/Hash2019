#!/bin/bash
#clear
javac -d ./bin *.java
#read -n 1 -s
java -cp ./bin RunJoin
