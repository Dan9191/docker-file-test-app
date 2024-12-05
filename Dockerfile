# образ java
FROM openjdk:17-jdk-slim

# рабочая директория в контейнере
WORKDIR /app

# копирование файлов
COPY build/libs/*.jar app.jar

# команда для запуска
ENTRYPOINT ["java", "-jar", "app.jar"]

# дефолтный порт
EXPOSE 8080