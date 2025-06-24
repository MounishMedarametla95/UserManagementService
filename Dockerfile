# Start from an official Java image
FROM openjdk:17-jdk-slim

# Set working directory in the container
WORKDIR /app

# Copy built jar file to the container
COPY target/usermanagementservice-0.0.1-SNAPSHOT.jar app.jar

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
