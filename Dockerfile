# Build-Phase mit Gradle
FROM gradle:8.5-jdk21 AS builder
COPY --chown=gradle:gradle . /app
WORKDIR /app
RUN gradle build --no-daemon

# Runtime-Phase mit Java 21
FROM eclipse-temurin:21-jdk
COPY --from=builder /app/build/libs/rezeptapp-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]