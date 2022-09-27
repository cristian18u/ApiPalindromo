FROM openjdk:8-jdk-alpine
ADD target/sistema-blog-spring-boot-api-rest-1.0.jar spring-boot-docker.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/spring-boot-docker.jar"]