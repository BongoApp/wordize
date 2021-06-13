FROM openjdk:8-jdk-alpine as builder


COPY mvnw .
COPY .mvn .mvn
COPY pom.xml .
COPY src src

RUN chmod +x ./mvnw
RUN ./mvnw install -DskipTests
RUN ./mvnw clean package
#RUN mkdir -p target/dependency && (cd target/dependency; jar -xf ../*.jar)


FROM openjdk:8-jdk-alpine
# MAINTAINER baeldung.com
EXPOSE 9000
VOLUME /tmp
ARG DEPENDENCY=/workspace/app/target/dependency
#COPY --from=builder ${DEPENDENCY}/BOOT-INF/lib /app/lib
#COPY --from=builder ${DEPENDENCY}/META-INF /app/META-INF
#COPY --from=builder ${DEPENDENCY}/BOOT-INF/classes /app
COPY  --from=builder /target/wordize-0.0.1-SNAPSHOT.jar wordize-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/wordize-0.0.1-SNAPSHOT.jar"]
