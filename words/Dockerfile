#
# Build stage
#
FROM maven:3.6.0-jdk-11-slim AS build
COPY src /app/src
COPY pom.xml /app
RUN mvn -f /app/pom.xml clean package

#
# Package stage
#
FROM openjdk:8-jdk-alpine as builder
COPY --from=build /app/target/wordize-0.0.1-SNAPSHOT.jar wordize-0.0.1-SNAPSHOT.jar
#RUN chmod +x ./mvnw
##RUN ./mvnw install -DskipTests
#RUN ./mvnw clean package
##RUN mkdir -p target/dependency && (cd target/dependency; jar -xf ../*.jar)
#

# MAINTAINER baeldung.com
EXPOSE 9000

ENTRYPOINT ["java","-jar","/wordize-0.0.1-SNAPSHOT.jar"]
