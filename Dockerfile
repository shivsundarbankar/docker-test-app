FROM openjdk:21
WORKDIR /appContainer
COPY ./target/docker-test-app.jar /appContainer
EXPOSE 8081
CMD ["java", "-jar", "docker-test-app.jar"]