FROM frolvlad/alpine-oraclejdk8:slim
ADD target/*.jar app.jar
RUN sh -c 'touch /app.jar'
ENTRYPOINT ["java","-jar","/app.jar"]
EXPOSE 8080
