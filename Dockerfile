FROM java:8

EXPOSE 8080:8080

ADD target/first-client-0.0.1-SNAPSHOT.jar /app/first-client-0.0.1-SNAPSHOT.jar

WORKDIR /app

ENTRYPOINT ["java", "-jar", "first-client-0.0.1-SNAPSHOT.jar"]