FROM maven:3.1.4-openjdk-17

WORKDIR /46330745BikeProject
COPY . .
RUN mvn clean install

CMD mvn spring-boot:run