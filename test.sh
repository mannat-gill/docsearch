set -e
javac -cp .:lib/hamcrest-core-1.3.jar:lib/junit-4.13.2.jar Server.java DocSearchServer.java DocSearchTest.java
java -cp .:lib/hamcrest-core-1.3.jar:lib/junit-4.13.2.jar org.junit.runner.JUnitCore DocSearchTest