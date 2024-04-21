FROM gradle:8.5.0-jdk17
ADD . /app
WORKDIR /app
RUN gradle jsBrowserProductionWebpack
