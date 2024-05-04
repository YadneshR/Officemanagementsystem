# Officemanagementsystem
Java Bakcend application using Springboot 
# Spring Boot CRUD Application

This is a simple CRUD (Create, Read, Update, Delete) application built using Spring Boot. It demonstrates how to build RESTful APIs to manage employee records in a MySQL database.

## Technologies Used

- Spring Boot
- Spring Data JPA
- Spring Web (Spring MVC)
- MySQL
- Lombok

## Prerequisites

- Java Development Kit (JDK) installed
- MySQL installed and running
- IDE (e.g., IntelliJ IDEA, Eclipse) or text editor

## Getting Started

### 1. Clone the Repository


git clone https://github.com/yourusername/spring-boot-crud.git 


Create a MySQL database named employeedb:
##CREATE DATABASE employeedb;


Update application.properties with your MySQL username and password:
spring.datasource.url=jdbc:mysql://localhost:3306/employeedb
spring.datasource.username=your_username
spring.datasource.password=your_password

Navigate to the project directory and run the following command:
./mvnw spring-boot:run
The application will start on http://localhost:8080

##You can use tools like Postman or curl commands to test the endpoints:


##CREATE operation:

POST create a new employee:
POST http://localhost:8080/api/employees
Body:
{
  "name": "John Doe",
  "role": "Software Engineer",
  "salary": 60000
}


##READ operation:

GET all employees:
GET http://localhost:8080/api/employees

GET employee by ID:
GET http://localhost:8080/api/employees/{id}


##UPDATE operation:

PUT update an existing employee:
PUT http://localhost:8080/api/employees/{id}
Body:
{
  "name": "Jane Smith",
  "role": "Senior Software Engineer",
  "salary": 80000
}


##DELETE operation:
DELETE employee by ID:
DELETE http://localhost:8080/api/employees/{id}

License
This project is licensed under the MIT License - see the LICENSE file for details.





