#COUPON MICROSERVICE DOCKERFILE 
FROM openjdk:8-jdk-alpine
#ADD [SOURCE] [DESTINATION]
# file being copied will be placed in the root directory of the Docker image being built with the name couponService-0.0.1-SNAPSHOT.jar.
ADD target/couponService-0.0.1-SNAPSHOT.jar couponService-0.0.1-SNAPSHOT.jar
ENTRYPOINT [ "java","-jar", "couponService-0.0.1-SNAPSHOT.jar"]
