FROM  alpine:3.19

RUN apk add openjdk17
COPY build/libs/driver-app.jar /app.jar

ENTRYPOINT ["java", "-jar", "/app.jar"]