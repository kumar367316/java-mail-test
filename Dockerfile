FROM openjdk:8
EXPOSE 8787
ADD target/spring-boot-email-freemarker-0.0.1.jar spring-boot-email-freemarker-0.0.1.jar
ENTRYPOINT ["java","-jar","/spring-boot-email-freemarker-0.0.1.jar"]