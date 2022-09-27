FROM openjdk:11
VOLUME /tpm
ADD ./target/sistema-blog-spring-boot-api-rest-1.0.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app.jar"]