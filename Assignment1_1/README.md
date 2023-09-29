## Assignment 1 : Event Management Service APIs
Welcome to the Event Management REST API documentation. This project is a Java and Spring Boot application that allows you to create users and manage events through a set of API endpoints. You can perform actions like adding, updating, listing, and deleting users and events using these endpoints. The project follows the MVC architecture, with clear separation of concerns among controllers, services, and repositories.

## Project Structure

The project follows a typical Spring Boot directory structure:

- `src/main/java`: Contains the Java source code for the project.
- `src/test/java`: Contains test cases for the project.
- `pom.xml`: The project's Maven configuration file.

## Setup and Usage

To run the Event Management application, follow these steps:

1. Clone the repository to your local machine.
2. Make sure you have Java and Maven installed.
3. Navigate to "Assignment 2" directory.
4. Run `mvn spring-boot:run` to start the application.
5. You can now use the provided CURL commands to interact with the API.

## API Endpoints

### List All Events

Endpoint: `GET /events`

Retrieves a list of all events.

**Example CURL Request:**
```bash
curl --location --request GET 'http://localhost:8080/events'
```

### Add Event

Endpoint: `POST /event`

Adds a new event.

**Example CURL Request:**
```bash
curl --location --request POST 'http://localhost:8080/event' \
--header 'Accept: application/json' \
--header 'Content-Type: application/json' \
--data-raw '{
    "name" : "SJSU Job Fair",
    "description" : "SJSU Job Fair",
    "dateTime" : "2023-08-05"
}'
```

### Update Event

Endpoint: `PUT /event/{eventId}`

Updates an existing event.

**Example CURL Request:**
```bash
curl --location --request PUT 'http://localhost:8080/event/1' \
--header 'Content-Type: application/json' \
--header 'Accept: application/json' \
--data-raw '{
    "name" : "SJSU Job Fair (Updated)",
    "description" : "SJSU Job Fair (Updated)",
    "dateTime" : "2023-08-10"
}'
```

### Delete Event

Endpoint: `DELETE /event/{eventId}`

Deletes an event.

**Example CURL Request:**
```bash
curl --location --request DELETE 'http://localhost:8080/event/1' \
--header 'Content-Type: application/json' \
--header 'Accept: application/json'
```

### List All Users

Endpoint: `GET /users`

Retrieves a list of all users.

**Example CURL Request:**
```bash
curl --location --request GET 'http://localhost:8080/users'
```

### Add User

Endpoint: `POST /event`

Adds a new event.

**Example CURL Request:**
```bash
curl --location --request POST 'http://localhost:8080/user' \
--header 'Accept: application/json' \
--header 'Content-Type: application/json' \
--data-raw '{
    "name" : "Test Name",
    "emailId" : "testmail@sjsu.edu",
    "mobileNo" : "1000000"
}'
```

### Update Event

Endpoint: `PUT /user/{userId}`

Updates an existing event.

**Example CURL Request:**
```bash
curl --location --request PUT 'http://localhost:8080/user/1' \
--header 'Content-Type: application/json' \
--header 'Accept: application/json' \
--data-raw '{
    "name" : "Test Name_updated",
    "emailId" : "testmail@sjsu.edu",
    "mobileNo" : "1000000"
}'
```

### Delete Event

Endpoint: `DELETE /event/{eventId}`

Deletes an event.

**Example CURL Request:**
```bash
curl --location --request DELETE 'http://localhost:8080/user/1' \
--header 'Content-Type: application/json' \
--header 'Accept: application/json'
```

### List All Registrations

Endpoint: `GET /registrations`

Retrieves a list of all registrations.

**Example CURL Request:**
```bash
curl --location --request GET 'http://localhost:8080/registrations'
```

### Add User

Endpoint: `POST /registration`

Adds a new event.

**Example CURL Request:**
```bash
curl --location --request POST 'http://localhost:8080/registration' \
--header 'Accept: application/json' \
--header 'Content-Type: application/json' \
--data-raw '{
    "userId" : "1",
    "eventId" : "1"
}'
```

### Delete Event

Endpoint: `DELETE /registration/{registrationId}`

Deletes an event.

**Example CURL Request:**
```bash
curl --location --request DELETE 'http://localhost:8080/registration/1' \
--header 'Content-Type: application/json' \
--header 'Accept: application/json'
```