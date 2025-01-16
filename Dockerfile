FROM amazoncorretto:17

ARG JAR_FILE=build/libs/kelly-cicd.jar
COPY ${JAR_FILE} .

ARG SPRING_BOOT_APP_PROFILE
ENV PROFILE=${SPRING_BOOT_APP_PROFILE}

ENTRYPOINT ["java", "-jar", "-Dspring.profiles.active=${PROFILE}", "kelly-cicd.jar"]
