# Microservices Learning Path

[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.1.0-green.svg)](https://spring.io/projects/spring-boot)
[![License](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)

## 🗺️ Navigation

### 📚 Core Concepts
- [🔍 Microservices Basics](./MICROSERVICES_BASICS.md) - Fundamental concepts and principles
- [🧩 Service Decomposition](./DECOMPOSITION.md) - Breaking down monolithic applications

### 🏗️ Communication Patterns
- [🌉 API Gateway](./API_GATEWAY.md) - Single entry point for all clients
- [🔍 Service Discovery](./SERVICE_DISCOVERY.md) - Dynamic service registration and discovery
- [⚡ Circuit Breaker](./CIRCUIT_BREAKER.md) - Prevent cascading failures

### ⚙️ Infrastructure
- [⚙️ Config Server](./CONFIG_SERVER.md) - Centralized configuration management
- [🌐 Service Mesh](./SERVICE_MESH.md) - Service-to-service communication infrastructure

### 🎯 Advanced Patterns
- [🎭 CQRS Pattern](./CQRS_PATTERN.md) - Command Query Responsibility Segregation
- [🔄 Saga Pattern](./SAGA_PATTERN.md) - Managing distributed transactions
- [⚡ Event-Driven Architecture](./EVENT_DRIVEN_ARCHITECTURE.md) - Building event-based systems

### 🚀 Quick Links
- [📦 Project Structure](#-project-structure)
- [🔐 Security](#-security)
- [📚 Additional Resources](#-additional-resources)

---

Welcome to the Microservices Learning Path! This comprehensive guide will help you master microservices architecture through structured learning modules and practical patterns.

## 🚀 Microservices Learning Roadmap

### 1️⃣ Core Concepts (3-4 weeks)
- [ ] **Microservices Fundamentals**
  - [ ] Monolithic vs Microservices
  - [ ] Bounded Contexts
  - [ ] Domain-Driven Design (DDD)
  - [ ] API-First Design
  - [ ] [Read More →](./MICROSERVICES_BASICS.md)

- [ ] **Service Decomposition**
  - [ ] Decomposition Strategies
  - [ ] Database per Service
  - [ ] Transaction Management
  - [ ] [Read More →](./DECOMPOSITION.md)

### 2️⃣ Communication & Integration (4-5 weeks)
- [ ] **API Gateway**
  - [ ] Routing & Composition
  - [ ] Authentication & Authorization
  - [ ] Rate Limiting & Throttling
  - [ ] [Read More →](./API_GATEWAY.md)

- [ ] **Service Discovery & Load Balancing**
  - [ ] Client-side vs Server-side Discovery
  - [ ] Service Registry
  - [ ] Load Balancing Strategies
  - [ ] [Read More →](./SERVICE_DISCOVERY.md)

- [ ] **Resilience Patterns**
  - [ ] Circuit Breaker
  - [ ] Retry & Timeout
  - [ ] Bulkhead Pattern
  - [ ] [Read More →](./CIRCUIT_BREAKER.md)

### 3️⃣ Data Management (4-5 weeks)
- [ ] **Distributed Data Patterns**
  - [ ] Database per Service
  - [ ] Shared Database
  - [ ] Saga Pattern
  - [ ] [Read More →](./SAGA_PATTERN.md)

- [ ] **CQRS & Event Sourcing**
  - [ ] Command/Query Separation
  - [ ] Event Sourcing
  - [ ] Event Sourcing with CQRS
  - [ ] [Read More →](./CQRS_PATTERN.md)

- [ ] **Event-Driven Architecture**
  - [ ] Event Sourcing
  - [ ] Event Streaming (Kafka/RabbitMQ)
  - [ ] Eventual Consistency
  - [ ] [Read More →](./EVENT_DRIVEN_ARCHITECTURE.md)

### 4️⃣ Infrastructure & Operations (5-6 weeks)
- [ ] **Containerization & Orchestration**
  - [ ] Docker Fundamentals
  - [ ] Kubernetes Basics
  - [ ] Service Mesh (Istio/Linkerd)
  - [ ] [Read More →](./SERVICE_MESH.md)

- [ ] **Configuration & Secrets**
  - [ ] Centralized Configuration
  - [ ] Secrets Management
  - [ ] Vault Integration
  - [ ] [Read More →](./CONFIG_SERVER.md)

- [ ] **Observability**
  - [ ] Distributed Tracing
  - [ ] Logging & Monitoring
  - [ ] Metrics & Alerting
  - [ ] Service Level Objectives (SLOs)

### 5️⃣ Security & Advanced Topics (4-5 weeks)
- [ ] **Security**
  - [ ] OAuth2 / OpenID Connect
  - [ ] JWT & API Security
  - [ ] mTLS & Service Mesh Security
  - [ ] Vault for Secrets Management

- [ ] **CI/CD & GitOps**
  - [ ] CI/CD Pipelines
  - [ ] Infrastructure as Code (Terraform)
  - [ ] GitOps with ArgoCD/Flux
  - [ ] Progressive Delivery

### 6️⃣ Production Readiness (3-4 weeks)
- [ ] **Testing Strategies**
  - [ ] Contract Testing
  - [ ] Chaos Engineering
  - [ ] Performance Testing
  - [ ] Security Testing

- [ ] **Scaling & Performance**
  - [ ] Horizontal Scaling
  - [ ] Caching Strategies
  - [ ] Database Scaling
  - [ ] Performance Optimization

- [ ] **Deployment Strategies**
  - [ ] Blue/Green Deployments
  - [ ] Canary Releases
  - [ ] Feature Flags
  - [ ] A/B Testing

## 🚀 Getting Started

### Prerequisites

Before diving into microservices, make sure you have the following installed:

- **Java Development Kit (JDK) 17+**
- **Gradle 8.0+** or **Maven 3.6+**
- **Docker** and **Docker Compose**
- **Git** for version control
- **IDE** (IntelliJ IDEA, VS Code, or Eclipse with proper plugins)
- **Postman** or similar API testing tool
- **Basic knowledge of Spring Boot and RESTful APIs**

### Quick Start with Example Project

1. **Clone the Repository**
   ```bash
   git clone https://github.com/your-username/microservices-learning-path.git
   cd microservices-learning-path/DecompositionOfService
   ```

2. **Run with Docker Compose**
   ```bash
   docker-compose up -d
   ```
   This will start all required services including:
   - Order Service
   - Payment Service
   - MySQL Database
   - API Documentation (Swagger UI)

3. **Access Services**
   - **Order Service**: http://localhost:8080
   - **Payment Service**: http://localhost:8081
   - **API Documentation**: http://localhost:8080/swagger-ui.html

### Learning Path Implementation

| Phase | Focus Area | Example Implementation |
|-------|------------|-------------------------|
| 1 | Core Concepts | [Service Decomposition Example](./DecompositionOfService) |
| 2 | Communication | [API Gateway & Service Discovery](./API_GATEWAY.md) |
| 3 | Data Management | [Saga Pattern Implementation](./SAGA_PATTERN.md) |
| 4 | Infrastructure | [Docker & Kubernetes Setup](./SERVICE_MESH.md) |
| 5 | Security | [OAuth2 & JWT Implementation](#) |
| 6 | Production | [CI/CD Pipeline Setup](#) |

### Next Steps

1. **Explore the Code**
   - Study the service decomposition in the example project
   - Examine API contracts and communication patterns
   - Review the database schema and transactions

2. **Hands-on Practice**
   - Add a new service (e.g., Notification Service)
   - Implement a new API endpoint
   - Add a new feature using the patterns learned

3. **Experiment**
   - Try different deployment strategies
   - Test resilience patterns
   - Implement monitoring and logging

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
