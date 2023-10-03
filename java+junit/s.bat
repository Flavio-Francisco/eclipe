@echo off

:: setting up classpath
set "CP=.;lib\junit-4.13.2.jar;lib\hamcrest-core-1.3.jar"

:: creating build directory
mkdir build

:: compiling into build directory
for /r bst %%i in (*.java) do (
    javac -cp %CP% -d build "%%i"
)

:: executing test files
java -cp %CP%;build org.junit.runner.JUnitCore bst.CalcTest
