FROM openjdk:8-jdk-alpine
LABEL app.name="ProductCatalogWebApp" app.type="web- springboot" app.port="8080"
MAINTAINER Arunachalam.J
RUN mkdir -p /deploy
WORKDIR /deploy
EXPOSE 8080/tcp
ARG DEPENDENCY=target/productCatalogWeb-1.5.8.RELEASE.war
COPY ${DEPENDENCY} .
ENTRYPOINT ["java", "-jar","productCatalogWeb-1.5.8.RELEASE.war"]
