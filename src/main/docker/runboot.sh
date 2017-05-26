#!/usr/bin/env bash
sleep 3
java -Dspring.application.name=${APPLICATION_NAME} -Ddatabase.ip=${DATABASE_IP} -Ddatabase.port=${DATABASE_PORT} -Djava.security.egd=file:/dev/./urandom -jar /app/app.jar