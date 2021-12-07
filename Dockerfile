FROM tomcat:9.0.53-jdk16-openjdk-slim-bullseye

RUN rm -rf /usr/local/tomcat/webapps/*

COPY ./target/italian-gang.war /usr/local/tomcat/webapps/ROOT.war

CMD ["catalina.sh", "run"]
