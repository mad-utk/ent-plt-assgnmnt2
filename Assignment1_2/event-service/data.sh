#!/bin/bash
# write a shell script to populate data using curl command

# Create Events
echo "********************************************"
echo "** Creating Events ... ********************"
echo "******************************************"
curl -X POST -H "Content-Type: application/json" -d '{"name":"SJSU Job Fair","description" : "Job Fair","dateTime" : "2023-08-10"}' http://localhost:8080/event
curl -X POST -H "Content-Type: application/json" -d '{"name":"SJSU International Meet","description" : "Meet","dateTime" : "2023-08-11"}' http://localhost:8080/event
curl -X POST -H "Content-Type: application/json" -d '{"name":"SJSU CS Orntn","description" : "CS Orientation","dateTime" : "2023-08-12"}' http://localhost:8080/event
curl -X POST -H "Content-Type: application/json" -d '{"name":"SJSU SE Orntn","description" : "SE Orientation","dateTime" : "2023-08-13"}' http://localhost:8080/event
curl -X POST -H "Content-Type: application/json" -d '{"name":"SJSU DS Orntn","description" : "DS Orientation","dateTime" : "2023-08-14"}' http://localhost:8080/event

# Check Events
echo "********************************************"
echo "** Checking Events ... ********************"
echo "******************************************"
curl -X GET 'http://localhost:8080/users'


