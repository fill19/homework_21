FROM openjdk:15-jdk-alpine
EXPOSE 8090
ARG JAR_FILE=target/homework_21-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]