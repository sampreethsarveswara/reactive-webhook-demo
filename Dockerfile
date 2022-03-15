FROM openjdk:8
ADD target/reactive-webhook-demo-0.0.1-SNAPSHOT.jar webhook-reactive-demo.jar
ENTRYPOINT ["java", "-jar", "webhook-reactive-demo.jar"]