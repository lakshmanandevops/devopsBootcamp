FROM openjdk:8-jdk-alpine

VOLUME /tmp

EXPOSE 8090

ARG JAR_FILE=/target/*.jar

COPY ${JAR_FILE} app.jar

RUN echo "This will create the Docker image in few moments. Please wait"

ENTRYPOINT ["java", "-jar", "app.jar"]

MAINTAINER "lakshmanandevops@gmail.com"
