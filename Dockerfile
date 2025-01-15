FROM amazoncorretto:17

ARG JAR_FILE=build/libs/kelly-cicd-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} /kelly-cicd.jar

ARG SPRING_BOOT_APP_PROFILE
ENV PROFILE=${SPRING_BOOT_APP_PROFILE}

ENTRYPOINT ["sh", "-c", "java -jar -Dspring.profiles.active=${PROFILE} /kelly-cicd.jar"]
