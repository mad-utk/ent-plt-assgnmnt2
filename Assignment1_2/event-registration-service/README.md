## Assignment 1_2 : Event Registration Service APIs
Welcome to the Event Registration REST API documentation. This project is a Java and Spring Boot application that allows you to create and manage registration through a set of API endpoints. You can perform actions like adding, updating, listing, and deleting registration using these endpoints. The project follows the MVC architecture, with clear separation of concerns among controllers, services, and repositories.

## Project Structure

The project follows a typical Spring Boot directory structure:

- `src/main/java`: Contains the Java source code for the project.
- `pom.xml`: The project's Maven configuration file.

## Setup and Usage

To run the Registration Service application, follow these steps:

1. Clone the repository to your local machine.
2. Make sure you have Java and Maven installed.
3. Navigate to "Assignment 2" directory.
4. Run `mvn spring-boot:run` to start the application.
5. You can now use the provided CURL commands to interact with the API.

## API Endpoints

### List All Registrations

Endpoint: `GET /registrations`

Retrieves a list of all registrations.

**Example CURL Request:**
```bash
curl --location --request GET 'http://localhost:8080/registrations'
```

### Add Registration

Endpoint: `POST /registration`

Adds a new registration.

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

### Delete Registration

Endpoint: `DELETE /registration/{registrationId}`

Deletes a registration.

**Example CURL Request:**
```bash
curl --location --request DELETE 'http://localhost:8080/registration/1' \
--header 'Content-Type: application/json' \
--header 'Accept: application/json'
```

### Create Docker Image
**Image Creation**
docker build -t name_of_image:1.0 ./

**Run Image**
docker run -d -p 8080:8080 --name container_name name_of_image:1.0 
