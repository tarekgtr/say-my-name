FROM openjdk:17
COPY target/say_my_name-0.0.1-SNAPSHOT.jar say-my-name-0.0.1.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/say-my-name-0.0.1.jar"]