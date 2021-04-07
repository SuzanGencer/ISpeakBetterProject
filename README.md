**ISpeakBetter**

This repository contains the ISpeakBetterTest project, which includes testing the "I Speak Better English Learning Platform", developed as a collaborative project exercise.

**Project Overview**

Target of the project is to create Automated Selenium UI Tests.
Continuous Deployment Environment is Github
Continuous Integration is Jenkins

##Installation Guide

Make sure you have the latest versions of Firefox and Chrome installed.

**Installing JDK 1.8**
Go to this website: https://www.oracle.com/java/technologies/javase/javase-jdk8-downloads.html

Install the JDK to your Local machine and set JAVA_HOME system Environment to your Java path.

**Installing maven**
To install Maven on windows, head over to Apache Maven site to download the latest version, select the Maven zip file, for example apache-maven-3.3.9-bin.zip. https://maven.apache.org/download.cgi

Add both M2_HOME and MAVEN_HOME variables to the Windows environment using system properties, and point it to your Maven folder.

Update the PATH variable by appending the Maven bin folder – %M2_HOME%\bin, so that you can run the Maven’s command everywhere.

To verify it run:

mvn -version

in the command prompt.

**Selenium Java**
Dependency of the Selenium Java from https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java
