FROM bellsoft/liberica-openjdk-alpine:21

RUN apk add curl jq

WORKDIR /home

ADD target ./target

ENTRYPOINT java -cp "target/Magneto/libs/Magneto-tests.jar:target/Magneto/libs/testng-7.10.2.jar:target/Magneto/libs/*:target/Magneto/libs/Magneto.jar" \
		   org.testng.TestNG -testclass Test.TestRunner