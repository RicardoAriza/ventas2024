FROM openjdk:17-jdk-slim
ARG JAR_FILE=target/punto_venta-0.0.1.jar
COPY ${JAR_FILE} app_ventas2024.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app_ventas2024.jar"]
