FROM openjdk:8
EXPOSE 8081
ADD target/sample.jar sample.jar
ENTRYPOINT ["java" , "-jar"  , "/sample.jar"]