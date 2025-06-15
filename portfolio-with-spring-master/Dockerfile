<<<<<<< HEAD
# Java 17 वाला lightweight image
FROM openjdk:17-jdk-slim
=======

FROM ubuntu
>>>>>>> 1da0887482ee098682d5d034542fb993042a9130

# container में working directory सेट करें
WORKDIR /app

# आपकी सभी फाइल्स को container में कॉपी करें
COPY . .

# Maven से Spring Boot app build करें
RUN ./mvnw clean install

<<<<<<< HEAD
# Spring Boot का default पोर्ट expose करें
EXPOSE 8080

# app को चलाने के लिए command
CMD ["java", "-jar", "target/portfolio-with-spring-0.0.1-SNAPSHOT.jar"]
=======
ENTRYPOINT [ "java", "-jar", "portfolio-with-spring-0.0.1-SNAPSHOT.jar" ]
>>>>>>> 1da0887482ee098682d5d034542fb993042a9130
