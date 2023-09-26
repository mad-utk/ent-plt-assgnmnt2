FROM maven:3-jdk-8-alpine

ADD . /app

WORKDIR /app

RUN mvn clean install

CMD ["mvn", "spring-boot:run"]