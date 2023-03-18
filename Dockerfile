FROM openjdk:17-jdk-alpine
MAINTAINER eu.pp
COPY target/springsec-0.0.1-SNAPSHOT.jar springsec-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/springsec-0.0.1-SNAPSHOT.jar]