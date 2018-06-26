#!/bin/sh
mvn clean package && docker build -t com.github.wesleyegberto/rest-assured-test .
docker rm -f rest-assured-test || true && docker run -d -p 8080:8080 -p 4848:4848 --name rest-assured-test com.github.wesleyegberto/rest-assured-test 
