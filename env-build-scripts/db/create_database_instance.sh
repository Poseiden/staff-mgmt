#!/bin/bash
set -e

docker run --name staff-mgmt -p 13306:3306 -e MYSQL_ROOT_PASSWORD=admin -d mysql:8
