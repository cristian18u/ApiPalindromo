FROM openjdk:8-jdk-alpine
COPY "./target/spring-boot-docker-0.0.2.jar" "app.jar"
EXPOSE 8080
ENTRYPOINT ["java","-jar","app.jar"]