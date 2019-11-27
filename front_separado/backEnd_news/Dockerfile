FROM maven:3.6-jdk-8
RUN mkdir -p /opt
COPY ./target/news-0.0.1-SNAPSHOT.jar /opt/
WORKDIR /opt
ENTRYPOINT exec java -jar /opt/news-0.0.1-SNAPSHOT.jar