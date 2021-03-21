FROM java:8

MAINTAINER skwen<sgh@iskwen.com>

COPY *.jar /app.jar

CMD ["--server.port=8844"]
EXPOSE 8844

ENTRYPOINT ["java","-jar","/app.jar"]