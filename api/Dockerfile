FROM openjdk:17

COPY ./target/*.war /api.war

ENTRYPOINT ["java","-jar","/api.war"]