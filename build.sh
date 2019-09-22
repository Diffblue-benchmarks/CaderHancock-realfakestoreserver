#!/bin/bash

echo "Running Git Pull"
git pull

echo "Building JAR for RealFakeStoreServer"
mvn clean package spring-boot:repackage

echo "Launching RealFakeStoreServer"
java -jar ./target/realfakestoreserver*

