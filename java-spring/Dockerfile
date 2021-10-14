FROM bellsoft/liberica-openjdk-alpine:11 as build
WORKDIR /scratch
COPY . .
RUN ./gradlew --no-daemon bootjar

FROM bellsoft/liberica-openjdk-alpine:11
WORKDIR /srv
RUN apk add bash curl
RUN curl https://raw.githubusercontent.com/vishnubob/wait-for-it/master/wait-for-it.sh > wait-for-it \
            && chmod +x wait-for-it
COPY --from=build /scratch/build/libs/address-service-*.jar address-service.jar
EXPOSE 8888
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "address-service.jar"]
