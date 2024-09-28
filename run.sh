# build the ktor application as a fatJar
sh ./build.sh

# run the proxy-server and the application
docker compose --project-directory . up