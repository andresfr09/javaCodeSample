FROM mherwig/docker-alpine-java-mongo
COPY "./target/sampleServletsUdeM4F-0.0.1-SNAPSHOT.jar" "app.jar"
# EXPOSE 8080
# ENTRYPOINT ["java","-jar","app.jar","]
#ENTRYPOINT ["LOGGING_LEVEL_ORG_SPRINGFRAMEWORK=DEBUG", "java","-jar","app.jar","-Dserver.port=$PORT","-Dlogging.level.org.springframework=DEBUG"]
ENTRYPOINT [ "java","-jar","app.jar","-Dserver.port=$PORT"]
