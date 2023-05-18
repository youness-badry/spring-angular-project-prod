FROM openjdk:17

COPY ./target/api-0.0.1-SNAPSHOT.war /api.war

ENTRYPOINT ["java","-jar","/api.war"]