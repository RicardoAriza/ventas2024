FROM openjdk:17-jdk-slim
ARG JAR_FILE=target/ventas_2024-0.0.1.jar
COPY ${JAR_FILE} app_ventas2024.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app_ventas2024.jar"]
