# Use an official Maven image to build the app
FROM maven:3.8.1-openjdk-11 as build

# Set the working directory
WORKDIR /app

# Copy the pom.xml and install dependencies
COPY pom.xml .
RUN mvn dependency:go-offline

# Copy the rest of the project files
COPY src /app/src

# Build the application
RUN mvn clean install

# Use a smaller OpenJDK image for running the app
FROM openjdk:11-jre-slim

# Set the working directory
WORKDIR /app

# Copy the jar file built in the previous stage
COPY --from=build /app/target/*.jar /app/app.jar

# Expose the port that your app runs on
EXPOSE 8080

# Run the application
CMD ["java", "-jar", "/app/app.jar"]
