./gradlew clean build
docker build -t dickchest/driver-api:1.0.0 .
docker push dickchest/driver-api:1.0.0
