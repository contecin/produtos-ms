FROM gradle:jdk17-alpine AS produtos_ms

COPY . /home/gradle/source

WORKDIR /home/gradle/source

RUN gradle clean build

# actual container
FROM openjdk:17-alpine

COPY --from=produtos_ms /home/gradle/source/build/libs/*-SNAPSHOT.jar /app/produtos_ms.jar

WORKDIR /app

EXPOSE ${SERVER_PORT}

ENTRYPOINT ["sh", "-c", "java ${JAVA_OPTS} -Dserver.port=${SERVER_PORT} -jar produtos_ms.jar"]