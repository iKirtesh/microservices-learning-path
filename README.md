# 🚀 Complete Microservices Learning Path

[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.1.0-green.svg)](https://spring.io/projects/spring-boot)
[![License](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)

## 🗺️ Navigation

### 📚 Core Concepts
- [🔍 Microservices Fundamentals](./MICROSERVICES_BASICS.md)
- [🧩 Service Decomposition](./DECOMPOSITION.md)
- [🌉 API Gateway](./API_GATEWAY.md)
- [🔍 Service Discovery](./SERVICE_DISCOVERY.md)
- [⚡ Circuit Breaker](./CIRCUIT_BREAKER.md)
- [⚙️ Config Server](./CONFIG_SERVER.md)

### 🏗️ Advanced Patterns
- [🎭 CQRS Pattern](./CQRS_PATTERN.md)
- [🔄 Saga Pattern](./SAGA_PATTERN.md)
- [⚡ Event-Driven Architecture](./EVENT_DRIVEN_ARCHITECTURE.md)
- [🌐 Service Mesh](./SERVICE_MESH.md)

---

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

## 🎯 Microservices Learning Roadmap

### Phase 1: Core Concepts (3-4 weeks)
- [ ] Monolithic vs Microservices Architecture
- [ ] Domain-Driven Design (DDD) Fundamentals
- [ ] RESTful API Design Principles
- [ ] Microservices Communication Styles
- [ ] Containerization Basics with Docker

### Phase 2: Service Design (4-5 weeks)
- [ ] Service Decomposition Strategies
- [ ] API Gateway Pattern
- [ ] Service Discovery & Registration
- [ ] Configuration Management
- [ ] Distributed Logging & Monitoring

### Phase 3: Data & Transactions (5-6 weeks)
- [ ] Database per Service Pattern
- [ ] Event Sourcing
- [ ] CQRS Pattern
- [ ] Saga Pattern for Distributed Transactions
- [ ] Data Consistency Patterns

### Phase 4: Resilience & Performance (4-5 weeks)
- [ ] Circuit Breaker Pattern
- [ ] Retry & Timeout Patterns
- [ ] Bulkhead Pattern
- [ ] Rate Limiting & Throttling
- [ ] Caching Strategies

### Phase 5: Advanced Architecture (5-6 weeks)
- [ ] Event-Driven Architecture
- [ ] Service Mesh (Istio/Linkerd)
- [ ] Serverless Microservices
- [ ] Container Orchestration (Kubernetes)
- [ ] Multi-cloud Deployments

### Phase 6: Security & Operations (4-5 weeks)
- [ ] OAuth2 & JWT Authentication
- [ ] mTLS & Service-to-Service Security
- [ ] Secrets Management
- [ ] CI/CD Pipelines
- [ ] GitOps Practices

## 🛠️ Essential Microservices Patterns (48 Total)

### 1-10: Core Patterns
1. API Gateway
2. Service Discovery
3. Circuit Breaker
4. Service Registry
5. Externalized Configuration
6. Service Template
7. Bulkhead
8. Retry
9. Timeouts
10. Rate Limiter

### 11-20: Data Patterns
11. Database per Service
12. Shared Database
13. Saga
14. CQRS
15. Event Sourcing
16. API Composition
17. Materialized View
18. Domain Events
19. Outbox Pattern
20. Transaction Log Tailing

### 21-30: Resilience Patterns
21. Circuit Breaker
22. Bulkhead
23. Retry
24. Timeout
25. Fallback
26. Health Check API
27. Externalized Configuration
28. Service Template
29. Service Instance per Container
30. Service Deployment Platform

### 31-40: Deployment Patterns
31. Multiple Service Instances per Host
32. Service Instance per Host
33. Service Instance per VM
34. Service Instance per Container
35. Serverless Deployment
36. Service Mesh
37. Sidecar
38. Ambassador
39. Adapter
40. Chassis

### 41-48: Testing & UI Patterns
41. Service Component Test
42. Service Integration Contract Test
43. End-to-End Test
44. Consumer-Driven Contract Test
45. Consumer-Side Contract Test
46. Server-Side Page Fragment Composition
47. Client-Side UI Composition
48. Backend for Frontend (BFF)

## 🚀 Getting Started

### Prerequisites

- **Java Development Kit (JDK) 17+**
- **Gradle 8.0+** or **Maven 3.6+**
- **Docker** and **Docker Compose**
- **Git** for version control
- **IDE** (IntelliJ IDEA, VS Code, or Eclipse with proper plugins)
- **Postman** or similar API testing tool

### Quick Start

1. **Clone the Repository**
   ```bash
   git clone https://github.com/your-username/microservices-learning-path.git
   cd microservices-learning-path/DecompositionOfService
   ```

2. **Run with Docker Compose**
   ```bash
   docker-compose up -d
   ```

3. **Access Services**
   - Order Service: http://localhost:8080
   - Payment Service: http://localhost:8081
   - API Docs: http://localhost:8080/swagger-ui.html

## 📚 Additional Resources

### Books
- "Microservices Patterns" by Chris Richardson
- "Building Microservices" by Sam Newman
- "Monolith to Microservices" by Sam Newman
- "Domain-Driven Design" by Eric Evans

### Online Courses
- Microservices with Spring Cloud (Udemy/Pluralsight)
- Kubernetes for Microservices
- Cloud-Native Microservices (Coursera/edX)

## 🤝 Contributing

Contributions are welcome! Please read our [contributing guidelines](CONTRIBUTING.md) to get started.

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---

Happy Learning! 🚀

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
