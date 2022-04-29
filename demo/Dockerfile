FROM grafana/ci-build-windows

FROM postgres
ENV POSTGRES_PASSWORD password
ENV POSTGRES_DB golf

ADD start.sh demo/src/main

