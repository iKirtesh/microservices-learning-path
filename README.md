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

Welcome to the Microservices Learning Path! This comprehensive guide will help you master microservices architecture through structured learning modules and practical patterns.

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

### 3. 🛠️ Hands-on Projects

#### [🛍️ Order & Payment System](./DecompositionOfService)
A practical microservices implementation with two core services communicating via REST APIs, featuring independent databases and comprehensive documentation.

**Tech Stack**:
- **Order Service**: Spring Boot, JPA, MySQL, REST
- **Payment Service**: Spring Boot, JPA, MySQL, REST
- **Tools**: Docker, Swagger, Postman

**Key Features**:
- ✅ Independent service deployment
- 🔄 RESTful inter-service communication
- 🗃️ Database per service pattern
- 📚 Swagger API documentation
- 🛡️ Centralized exception handling
- 🐳 Docker Compose for local development

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

2. **🚀 Recommended Learning Path**

   | Step | Task | Expected Outcome |
   |------|------|------------------|
   | 1 | [Explore Order Service](./DecompositionOfService/Order) | Understand order management implementation |
   | 2 | [Examine Payment Service](./DecompositionOfService/Payment) | Learn payment processing flow |
   | 3 | [Study API Contracts](./DecompositionOfService#api-endpoints) | Understand service communication |
   | 4 | [Run with Docker Compose](./DecompositionOfService#quick-start) | Deploy the complete system |
   | 5 | [Test API Endpoints](./DecompositionOfService#api-documentation) | Verify service functionality |
   | 6 | Extend Functionality | Add new features to the services |

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
