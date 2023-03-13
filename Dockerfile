FROM eclipse-temurin:17-jre-alpine

RUN mkdir /app
COPY target/micronaut-samples-1.0.0.jar /app/app.jar

ENTRYPOINT java -jar /app/app.jar
