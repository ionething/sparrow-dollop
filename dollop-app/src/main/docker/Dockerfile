FROM openjdk:8-jre-alpine
WORKDIR /opt/app

ARG JAR_FILE
ADD ${JAR_FILE} app.jar

ENV TZ=Asia/Shanghai \
    JAVA_OPTS=""
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone

EXPOSE 8080
ENTRYPOINT java ${JAVA_OPTS} -Dfile.encoding=UTF8 -Djava.security.egd=file:/dev/./urandom -jar /opt/app/app.jar --spring.profiles.active=deploy
