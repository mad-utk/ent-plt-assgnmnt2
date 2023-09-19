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

# Create Users
echo "********************************************"
echo "** Creating Users ... *********************"
echo "******************************************"
curl -X POST -H "Content-Type: application/json" -d '{"name":"AName","emailId" : "AMail@id.com","mobileNo" : "1000000"}' http://localhost:8080/user
curl -X POST -H "Content-Type: application/json" -d '{"name":"BName","emailId" : "BMail@id.com","mobileNo" : "2000000"}' http://localhost:8080/user
curl -X POST -H "Content-Type: application/json" -d '{"name":"CName","emailId" : "CMail@id.com","mobileNo" : "3000000"}' http://localhost:8080/user
curl -X POST -H "Content-Type: application/json" -d '{"name":"DName","emailId" : "DMail@id.com","mobileNo" : "4000000"}' http://localhost:8080/user
curl -X POST -H "Content-Type: application/json" -d '{"name":"EName","emailId" : "EMail@id.com","mobileNo" : "5000000"}' http://localhost:8080/user
curl -X POST -H "Content-Type: application/json" -d '{"name":"FName","emailId" : "FMail@id.com","mobileNo" : "6000000"}' http://localhost:8080/user
curl -X POST -H "Content-Type: application/json" -d '{"name":"GName","emailId" : "GMail@id.com","mobileNo" : "7000000"}' http://localhost:8080/user
curl -X POST -H "Content-Type: application/json" -d '{"name":"HName","emailId" : "HMail@id.com","mobileNo" : "8000000"}' http://localhost:8080/user
curl -X POST -H "Content-Type: application/json" -d '{"name":"IName","emailId" : "IMail@id.com","mobileNo" : "9000000"}' http://localhost:8080/user

# Check Users
echo "********************************************"
echo "** Creating Users ... *********************"
echo "******************************************"
curl -X GET 'http://localhost:8080/users'