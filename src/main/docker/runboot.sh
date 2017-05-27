#!/usr/bin/env bash
sleep 5
java -Dspring.application.name=${APPLICATION_NAME} \
    -Ddatabase.ip=${DATABASE_IP} \
    -Ddatabase.port=${DATABASE_PORT} \
    -Djava.security.egd=file:/dev/./urandom \
    -Dspring.redis.host=${REDIS_HOST} \
    -Dspring.redis.port=${REDIS_PORT} \
    -jar /app/app.jar