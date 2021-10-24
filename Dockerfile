FROM openjdk:15
COPY "./out/artifacts/sampleServletsUdeM4F_jar/sampleServletsUdeM4F.jar" "app.jar"
EXPOSE 8080
ENTRYPOINT ["java","-jar","app.jar"]


