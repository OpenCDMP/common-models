FROM maven:3-eclipse-temurin-21

RUN apt-get update
RUN apt-get install gpg -y

ARG MAVEN_ACCOUNT_USR
ARG MAVEN_ACCOUNT_PSW
ARG REVISION
ARG MAVEN_GPG_PASSPHRASE
ARG MAVEN_GPG_KEYNAME
ARG PROFILE
ENV gpg_keyname=$MAVEN_GPG_KEYNAME
ENV gpg_passphrase=$MAVEN_GPG_PASSPHRASE
ENV server_username=$MAVEN_ACCOUNT_USR
ENV server_password=$MAVEN_ACCOUNT_PSW

COPY settings.xml /root/.m2/settings.xml
COPY keypair.asc /tmp/keypair.asc
RUN if [ "$PROFILE" = "ossrh" ]; then \
    gpg --batch --import /tmp/keypair.asc; \
  fi

WORKDIR /build/

COPY . .

RUN mvn -Drevision=${REVISION} -P${PROFILE} clean deploy