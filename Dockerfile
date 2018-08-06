FROM openjdk:8-jdk-alpine
LABEL maintainer="kozak.sebastian@poczta.pl"
VOLUME /tmp
EXPOSE 8080
ARG JAR_FILE=target/newSpot-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} newSpot.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/newSpot.jar"]
