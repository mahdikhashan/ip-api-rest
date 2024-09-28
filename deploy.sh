#!/bin/sh

docker tag ip-api-rest-web:latest ghcr.io/mahdikhashan/ip-api-rest-web

echo "pushing web"
docker push ghcr.io/mahdikhashan/ip-api-rest-web
