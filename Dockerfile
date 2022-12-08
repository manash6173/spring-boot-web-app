FROM openjdk:11

COPY target /target

WORKDIR /target
EXPOSE 8080

ENTRYPOINT ["java","-jar","spring-boot-web-app-0.0.1-SNAPSHOT.jar"]