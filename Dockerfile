FROM amazoncorretto:17-alpine-jdk
COPY build/libs/best-commerce-0.0.1-SNAPSHOT.jar service.jar
ENTRYPOINT ["java","-jar","/service.jar"]