Bank Microservices Architecture
A modern, cloud-native banking application built with Spring Boot and microservices architecture.

Architecture Overview
This project follows a microservices architecture with the following key components:

Core Services
Accounts Service: Manages customer bank accounts
Cards Service: Handles credit/debit card operations
Loans Service: Manages loan products and processing
Infrastructure Services
Config Server: Centralized configuration management
Eureka Server: Service discovery and registration
Gateway Server: API Gateway for routing requests
Message Service: Handles asynchronous communication
Supporting Services
RabbitMQ: Message broker for inter-service communication
Keycloak: Identity and Access Management (IAM) solution
Prometheus & Grafana: Monitoring and visualization
Technology Stack
Java 17
Spring Boot 3.5.0
Spring Cloud 2025.0.0
Spring Cloud Config
Spring Cloud Netflix Eureka
Spring Cloud Gateway
Spring Data JPA
H2 Database (Development)
RabbitMQ
Keycloak
Docker
Prometheus
Grafana
Getting Started
Prerequisites
Java 17 or higher
Maven 3.6.3 or higher
Docker and Docker Compose
Git
Local Development Setup
Clone the repository

git clone <repository-url>
cd Bank_microservice_v7
Build the project

mvn clean install
Start the infrastructure

cd docker-compose/prod
docker-compose up -d
Access the services

Eureka Dashboard: http://localhost:8070
Config Server: http://localhost:8071
API Gateway: http://localhost:8072
Keycloak Admin Console: http://localhost:7080
API Documentation
API documentation is available through Swagger UI:

http://localhost:8080/swagger-ui.html (for individual services)
http://localhost:8072/accounts/swagger-ui.html (through API Gateway)
Monitoring
Prometheus: http://localhost:9090
Grafana: http://localhost:3000
Default credentials: admin/admin
Security
Authentication: OAuth2 with Keycloak
Authorization: Role-based access control (RBAC)
JWT: JSON Web Tokens for stateless authentication
Deployment
The application is designed to be deployed using Docker containers. The docker-compose directory contains the necessary configuration for production deployment.

Contributing
Fork the repository
Create your feature branch (git checkout -b feature/AmazingFeature)
Commit your changes (git commit -m 'Add some AmazingFeature')
Push to the branch (git push origin feature/AmazingFeature)
Open a Pull Request
License
This project is licensed under the MIT License - see the LICENSE file for details.

Contact
For any questions or feedback, please open an issue in the repository.
