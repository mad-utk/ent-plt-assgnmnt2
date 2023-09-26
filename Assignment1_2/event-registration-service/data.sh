#!/bin/bash
# write a shell script to populate data using curl command

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