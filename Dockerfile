FROM openjdk:17
COPY . /home/gradle/src
WORKDIR /home/gradle/src
RUN ./gradlew clean build --no-daemon
FROM tomcat:9.0.63 as tomcat
EXPOSE 8080