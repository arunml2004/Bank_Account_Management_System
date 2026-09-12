 Bank Account Management System

A RESTful Bank Account Management System developed using Java Spring Boot, Spring Data JPA, Hibernate, and MySQL. The application provides APIs to manage bank accounts and perform CRUD operations.

 Features

* Create a new bank account
* View all accounts
* Find an account by ID
* Update account details
* Delete an account
* Input validation
* Unique account number validation
* MySQL database integration

 Tech Stack

* Java 17
* Spring Boot
* Spring Web
* Spring Data JPA
* Hibernate
* MySQL
* Maven
* Lombok
*  Postman

Architecture

text
Controller
    ↓
Service
    ↓
DAO
    ↓
Repository
    ↓
MySQL Database

PI Endpoints

| Method | Endpoint       | Description          |
| ------ | -------------- | -------------------- |
| POST   | `/accounts`    | Create account       |
| GET    | `/accounts`    | Get all accounts     |
| GET    | `/accounts/id` | Get account by ID    |
| PUT    | `/accounts`    | Update account       |
| DELETE | `/accounts/id` | Delete account by ID |
| DELETE | `/accounts`    | Delete all accounts  |

Database Configuration

Configure your MySQL database in `application.properties`:

properties
spring.datasource.url=jdbc:mysql://localhost:3306/Bank
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

Run the Project

bash
mvn clean install
mvn spring-boot:run


The application runs on:

text
http://localhost:7031


Use Postman to test the REST APIs.

Author

Arun M L

Java Full Stack Developer
