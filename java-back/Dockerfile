FROM maven:3.9.1-amazoncorretto-17 AS build
COPY . .
RUN mvn clean package

# FROM amazoncorretto:17
# COPY --from=build /usr/src/app/target/java-back.jar /usr/local/lib/java-back.jar
# EXPOSE 8080
# ENTRYPOINT ["java", "-jar", "/usr/local/lib/java-back.jar"]

FROM amazoncorretto:17
COPY --from=build ./target/java-back.jar java-back.jar
ENTRYPOINT ["java", "-jar", "java-back.jar"]
EXPOSE 8080