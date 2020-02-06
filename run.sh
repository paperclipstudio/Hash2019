#!/bin/bash
#clear
javac -d ./bin ./src/*.java
#read -n 1 -s
java -cp ./bin Main
