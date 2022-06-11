#!/usr/bin/env bash

read -rp "query: " query

queryWithSelect="select $query"
curl -w '\n' --silent -X GET -G 'http://localhost:8080/expanses' --data-urlencode query="$queryWithSelect" | jq '.'
