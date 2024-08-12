# Security Application

## Overview
This project is a Spring Boot application that provides security features using JWT authentication. It includes custom filters for JWT authentication and response logging.

## Features
- JWT Authentication
- Stateless session management
- Custom filters for request and response logging
- Secure endpoints with role-based access control

## Endpoints
- `POST /auth/login` - Authenticate user and generate JWT token
- `POST /auth/register` - Register a new user
- `GET /posts` - Public endpoint accessible without authentication
- `GET /error` - Public endpoint for error handling
- `GET /secure` - Secure endpoint accessible only with valid JWT token

## Dependencies
- Spring Boot Starter Web
- Spring Boot Starter Security
- Spring Boot Starter Data JPA
- Lombok
- Jakarta Servlet API
- Spring Web

## Installation
1. Clone the repository:
    ```sh
    git clone https://github.com/rudradcruze/securityapp.git
    ```
2. Navigate to the project directory:
    ```sh
    cd securityapp
    ```
3. Build the project using Maven:
    ```sh
    mvn clean install
    ```
4. Run the application:
    ```sh
    mvn spring-boot:run
    ```

## Configuration
- Configure the database connection in `application.properties`.
- Set up JWT secret and expiration time in `application.properties`.

## Usage
1. Register a new user by sending a POST request to `/auth/register` with user details.
2. Authenticate the user by sending a POST request to `/auth/login` with credentials to receive a JWT token.
3. Use the JWT token to access secure endpoints by including it in the `Authorization` header as `Bearer <token>`.

## Custom Filters
### JwtAuthFilter
- Validates the JWT token and sets the authentication in the security context.

### ResponseLoggerFilter
- Logs the details of each request and response for debugging and monitoring purposes.

## Exception Handling
- Custom exception handling is implemented to resolve exceptions and provide meaningful error responses.

## 🚀 About Me

Tech-savvy learner/programmer pushing boundaries of online tech. Passionate about new tools, seeking challenges to advance skills.

## 🔗 Social Links

![Name](https://img.shields.io/badge/Name-Francis%20Rudra%20D%20Cruze-yellowgreen?style=for-the-badge)
[![linkedin](https://img.shields.io/badge/linkedin-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/rudradcruze)
[![twitter](https://img.shields.io/badge/twitter-1DA1F2?style=for-the-badge&logo=twitter&logoColor=white)](https://twitter.com/rudradcruze)
[![Facebook](https://img.shields.io/badge/facebook-4267B2?style=for-the-badge&logo=facebook&logoColor=white)](https://facebook.com/rudradcruze)
[![francisrudra@gmail.com](https://img.shields.io/badge/gmail-4267B2?style=for-the-badge&logo=gmail&logoColor=white)](mailto:francisrudra@gmail.com)