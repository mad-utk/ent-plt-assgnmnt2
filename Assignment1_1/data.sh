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
echo "/n/n/n"
echo "********************************************"
echo "** Checking Events ... ********************"
echo "******************************************"
curl -X GET 'http://localhost:8080/users'

# Create Users
echo "/n/n"
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
echo "/n/n"
echo "********************************************"
echo "** Checking Users ... *********************"
echo "******************************************"
curl -X GET 'http://localhost:8080/users'

# Register users to events
# echo "/n/n"
# echo "********************************************"
# echo "** Registering Users to Events ... ********"
# echo "******************************************"
curl -X POST -H "Content-Type: application/json" -d '{"userId":1,"eventId":1}' http://localhost:8080/eventRegistration
curl -X POST -H "Content-Type: application/json" -d '{"userId":2,"eventId":1}' http://localhost:8080/eventRegistration
curl -X POST -H "Content-Type: application/json" -d '{"userId":3,"eventId":1}' http://localhost:8080/eventRegistration
curl -X POST -H "Content-Type: application/json" -d '{"userId":4,"eventId":2}' http://localhost:8080/eventRegistration
curl -X POST -H "Content-Type: application/json" -d '{"userId":5,"eventId":2}' http://localhost:8080/eventRegistration
curl -X POST -H "Content-Type: application/json" -d '{"userId":6,"eventId":2}' http://localhost:8080/eventRegistration
curl -X POST -H "Content-Type: application/json" -d '{"userId":7,"eventId":3}' http://localhost:8080/eventRegistration
curl -X POST -H "Content-Type: application/json" -d '{"userId":8,"eventId":3}' http://localhost:8080/eventRegistration
curl -X POST -H "Content-Type: application/json" -d '{"userId":9,"eventId":3}' http://localhost:8080/eventRegistration

# Check Users
# echo "/n/n"
# echo "********************************************"
# echo "** Checking Regis ... *********************"
# echo "******************************************"
curl -X GET 'http://localhost:8080/eventRegistrations'
curl -X GET 'http://localhost:8080/eventRegistration/getAllUsersOfEvent/1'