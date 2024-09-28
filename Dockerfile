FROM ubuntu:latest
LABEL authors="mahdi"

ENTRYPOINT ["top", "-b"]