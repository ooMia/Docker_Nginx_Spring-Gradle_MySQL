FROM gradle:jdk17-alpine AS build
COPY --chown=gradle:gradle . /home/gradle/src
WORKDIR /home/gradle/src
RUN gradle build

FROM bellsoft/liberica-openjre-alpine AS runner
EXPOSE 8080
RUN mkdir /app
COPY --from=build /home/gradle/src/build/libs/*.jar /app/spring-boot-application.jar
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom","-jar","/app/spring-boot-application.jar"]
#ARG JAR_FILE=build/libs/*-SNAPSHOT.jar
#COPY ${JAR_FILE} app.jar
#ENTRYPOINT [ \
#   "java", \
#   "-jar", \
#   "/app.jar" \
#]
