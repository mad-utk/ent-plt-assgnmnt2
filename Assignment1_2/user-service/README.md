## User Service
## Assignment 1_2 : User Service APIs
Welcome to the User REST API documentation. This project is a Java and Spring Boot application that allows you to create and manage user data through a set of API endpoints. You can perform actions like adding, updating, listing, and deleting users using these endpoints. The project follows the MVC architecture, with clear separation of concerns among controllers, services, and repositories.

## Project Structure

The project follows a typical Spring Boot directory structure:

- `src/main/java`: Contains the Java source code for the project.
- `pom.xml`: The project's Maven configuration file.

## Setup and Usage

To run the User service application, follow these steps:

1. Clone the repository to your local machine.
2. Make sure you have Java and Maven installed.
3. Navigate to "Assignment 1_2" directory.
4. Run `mvn spring-boot:run` to start the application.
5. You can now use the provided CURL commands to interact with the API.

## API Endpoints

### List All Users

Endpoint: `GET /users`

Retrieves a list of all users.

**Example CURL Request:**
```bash
curl --location --request GET 'http://localhost:8080/users'
```

### Add User

Endpoint: `POST /user`

Adds a new user.

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

### Update User

Endpoint: `PUT /user/{userId}`

Updates an existing user.

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

### Delete User

Endpoint: `DELETE /user/{userId}`

Deletes an user.

**Example CURL Request:**
```bash
curl --location --request DELETE 'http://localhost:8080/user/1' \
--header 'Content-Type: application/json' \
--header 'Accept: application/json'
```

### Create Docker Image
**Image Creation**
docker build -t name_of_image:1.0 ./

**Run Image**
docker run -d -p 8080:8080 --name container_name name_of_image:1.0 
