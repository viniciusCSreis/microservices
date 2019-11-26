FROM maven:3.6-jdk-8
RUN mkdir -p /opt
COPY . /opt
COPY ./m2 /root/.m2/
WORKDIR /opt
RUN mvn clean install -DskipTests
ENTRYPOINT exec java -jar /opt/target/demo-0.0.1-SNAPSHOT.jar