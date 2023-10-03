#!/bin/bash

## setting up classpath
CP=".:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar:"

## creating build directory
mkdir -p build

## compiling into build directory
find bst -name "*.java" | xargs javac -cp $CP -d build

## executing test files
java -cp $CP:build org.junit.runner.JUnitCore bst.CalcTest
