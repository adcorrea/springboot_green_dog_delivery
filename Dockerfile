FROM openjdk:17
RUN mkdir app
ARG JAR_FILE
ADD /target/${JAR_FILE} /app/springboot_green_dog_delivery.jar
WORKDIR /app
ENTRYPOINT java -jar springboot_green_dog_delivery.jar