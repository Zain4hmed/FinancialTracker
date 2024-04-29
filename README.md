# Financial Tracker Application

## Overview
This project aims to develop a financial tracker application using Java and Spring Boot. The application allows users to track their expenses, manage budgets, split bills, and gain insights into their spending habits. It also provides functionalities to manage user accounts and transactions.

## Features
- **Expense Tracking**: Users can categorize their transactions into different categories such as salary, food, grocery, etc.
- **Budget Planning**: Users can set budgets for different expense categories to manage their spending.
- **Transaction Management**: Users can view, add, update, and delete their transactions.
- **User Account Management**: Users can create accounts and manage their profiles.

## Technologies Used
- **Java**: Core programming language for developing the backend logic.
- **Spring Boot**: Framework for building robust and scalable Java applications.
- **Hibernate**: ORM (Object-Relational Mapping) tool for database interaction.
- **H2 Database**: Lightweight, in-memory database for development and testing.
- **Lombok**: Library to reduce boilerplate code by generating getters, setters, constructors, etc.
- **Maven**: Dependency management tool for Java projects.

## Project Structure
- **`com.financial.tracker.entity`**: Contains entity classes representing the database tables (e.g., `UserEntity`, `Transaction`, `Category`, `TransactionType`).
- **`com.financial.tracker.repository`**: Contains repository interfaces for database CRUD operations.
- **`com.financial.tracker.service`**: Contains service classes to handle business logic.
- **`com.financial.tracker`**: Main package containing the Spring Boot application class (`TrackerApplication`).
- **`application.properties`**: Configuration file for Spring Boot application properties.

## Getting Started
1. Clone this repository to your local machine.
2. Import the project into your preferred Java IDE (e.g., IntelliJ IDEA, Eclipse).
3. Make sure you have Java and Maven installed on your machine.
4. Run the `TrackerApplication` class to start the Spring Boot application.
5. Access the H2 Console to view and manage the in-memory database by navigating to `http://localhost:8080/h2-console`.

## Next Steps
- Implement authentication and authorization for user accounts.
- Develop frontend components using frameworks like React or Angular.
- Enhance transaction management features (e.g., filtering, sorting, search).
- Implement budget planning and analytics functionalities.
- Explore integration with OpenAI or other AI technologies for insights generation.
