# Microservices Learning Path

[![Java](https://img.shields.io/badge/Java-17%2B-blue.svg)](https://www.oracle.com/java/)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.1.0-green.svg)](https://spring.io/projects/spring-boot)
[![License](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)

## 🗂️ Navigation

- [📚 Learning Path](#-learning-topics)
- [🔍 Microservices Basics](./MICROSERVICES_BASICS.md)
- [🧩 Decomposition Guide](./DECOMPOSITION.md)
- [🚀 Getting Started](#-getting-started)
- [📦 Project Structure](#-project-structure)

---

Welcome to the Microservices Learning Path! This guide will help you understand and implement microservices architecture through practical examples and projects.

## 📚 Learning Topics

### 1. Introduction to Microservices
- [ ] What are Microservices?
- [ ] Monolithic vs Microservices Architecture
- [ ] Benefits and Challenges
- [ ] When to use Microservices

### 2. Core Concepts
- [x] Decomposition of Services
- [ ] API Gateway Pattern
- [ ] Service Discovery
- [ ] Circuit Breaker Pattern
- [ ] Distributed Tracing
- [ ] Event Sourcing
- [ ] CQRS (Command Query Responsibility Segregation)

### 3. Hands-on Projects

#### [Decomposition of Service](./DecompositionOfService)
A practical implementation of a microservices-based order and payment system demonstrating service decomposition, inter-service communication, and database per service pattern.

Key Features:
- Order Service
- Payment Service
- RESTful APIs
- Docker Compose for database
- Swagger API Documentation
- Centralized Exception Handling

### 4. Advanced Topics
- [ ] Container Orchestration with Kubernetes
- [ ] Service Mesh with Istio
- [ ] Event-Driven Architecture
- [ ] Saga Pattern for Distributed Transactions
- [ ] API Versioning Strategies
- [ ] Security in Microservices (OAuth2, JWT)

### 5. Best Practices
- [ ] Domain-Driven Design (DDD)
- [ ] API Design Guidelines
- [ ] Testing Strategies
- [ ] Monitoring and Logging
- [ ] CI/CD for Microservices

## 🚀 Getting Started

1. **Prerequisites**
   - Java 17+
   - Gradle 8.0+
   - Docker and Docker Compose
   - Basic knowledge of Spring Boot

2. **Recommended Learning Path**
   1. Start with the [Decomposition of Service](./DecompositionOfService/README.md) project
   2. Understand the service boundaries and API contracts
   3. Explore how services communicate
   4. Study the exception handling and validation
   5. Try extending the services with new features

## 📚 Additional Resources

### Books
- "Building Microservices" by Sam Newman
- "Microservices Patterns" by Chris Richardson
- "Monolith to Microservices" by Sam Newman

### Online Courses
- Microservices with Spring Cloud (Pluralsight/Udemy)
- Microservices Architecture (Coursera/edX)

### Documentation
- [Spring Cloud](https://spring.io/projects/spring-cloud)
- [Docker Documentation](https://docs.docker.com/)
- [Kubernetes Documentation](https://kubernetes.io/docs/home/)

## 🤝 Contributing

Feel free to contribute to this learning path by:
- Adding more learning resources
- Improving documentation
- Adding more example projects
- Fixing issues

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---

Happy Learning! 🚀
