FROM adoptopenjdk/openjdk11:alpine-jre

EXPOSE 8080

COPY target/app.jar /opt/app.jar

ENV JAVA_OPTS -XX:MaxRAMPercentage=80.0

ENTRYPOINT exec java $JAVA_OPTS -jar opt/app.jar