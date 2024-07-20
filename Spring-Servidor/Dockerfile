FROM amazoncorretto:17-alpine-jdk

# Copy the jar file to the root directory of the container
COPY target/Spring-Servidor-0.0.1-SNAPSHOT.jar /app.jar

EXPOSE 8091

# Run the jar file
ENTRYPOINT ["java", "-jar", "/app.jar"]