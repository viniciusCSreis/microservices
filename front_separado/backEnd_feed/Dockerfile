FROM maven:3.6-jdk-8
RUN mkdir -p /opt
COPY ./target/feed-0.0.1-SNAPSHOT.jar /opt/
WORKDIR /opt
ENTRYPOINT exec java -jar /opt/feed-0.0.1-SNAPSHOT.jar