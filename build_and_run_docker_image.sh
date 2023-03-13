#!/bin/sh

docker stop micronaut_samples
docker rm micronaut_samples
docker rmi micronaut_samples

docker build -t micronaut_samples .

docker run --rm --name micronaut_samples -p 8080:8080 micronaut_samples
