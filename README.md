# Car Rental Application

Welcome to the Car Rental Application! This application allows users to browse and book vehicles for specified time ranges. Admins and dealers can manage the fleet of vehicles.

## Features

- **User Authentication and Authorization:** Users can sign up, log in, and access features based on their roles.
- **Vehicle Management:** Admins and dealers can add, update, and delete vehicle details.
- **Booking System:** Users can search, view, and book vehicles for specific time ranges.
- **Role-Based Access Control:** Different roles (user, admin, dealer) have different access levels.
- **Availability Check:** The system ensures a vehicle is available before allowing a booking.

## Technologies Used

- Spring Boot
- Spring Data JPA
- Hibernate
- PostgreSQL (or your preferred database)


## Getting Started

1. **Clone the repository:**

   ```bash
   git clone https://github.com/yourusername/car-rental.git

2. **Configure the database:**

  -> Create a MySQL database and update the application.properties file with your database configuration.

3. **Build and run the application**

## Usage

1. Register:
   -> Sign up as a user or admin.
2. Log In:
   -> Log in using your credentials.
3. Explore:
   -> Browse available vehicles and their details.
4. Book a Vehicle:
   -> Select a vehicle and book it for a specified time range.
5. Admin/Dealer Actions:
   -> Admins and dealers can manage vehicles (add, update, delete).

## Database Configuaration

spring.datasource.url=jdbc:postgresql://localhost:5432/databaseName
spring.datasource.username= *databaseUsername*
spring.datasource.password= *databasePassword*
spring.jpa.hibernate.ddl-auto=update
spring.jpa.properties.hibernate.format_sql=true
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect

