FROM maven:3-jdk-14

WORKDIR /spring-rest-api
COPY . .
RUN mvn clean install

CMD mvn spring-boot:run