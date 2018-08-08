## Można zalinkować lokalne repo mavena żeby nie dociągało cały czas zależności
FROM maven:3.5.4-jdk-8-alpine AS build
COPY src /usr/src/app/src
COPY pom.xml /usr/src/app
RUN mvn -f /usr/src/app/pom.xml clean package

FROM openjdk:8-jdk-alpine
LABEL maintainer="kozak.sebastian@poczta.pl"
VOLUME /tmp
EXPOSE 8080
COPY --from=build /usr/src/app/target/newSpot-0.0.1-SNAPSHOT.jar /usr/app/newSpot.jar
ENTRYPOINT ["java","-jar","/usr/app/newSpot.jar"]
