#!/bin/bash
# write a shell script to populate data using curl command

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