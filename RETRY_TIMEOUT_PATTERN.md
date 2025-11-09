# 🔄 Retry & Timeout Pattern

## 📌 Overview
The Retry & Timeout pattern is essential for building resilient microservices. It helps handle transient failures and prevents cascading failures by:
- **Retrying** failed operations
- **Timing out** long-running operations
- **Implementing backoff strategies**

```mermaid
graph LR
    A[Client] -->|Request| B[Service A]
    B -->|Fails| C[Retry Logic]
    C -->|Wait & Retry| B
    C -->|Max Retries| D[Fallback]
    
    style C fill:#FFF3E0,stroke:#333
    style D fill:#FFEBEE,stroke:#333
```

## 🎯 Why Use Retry & Timeout?

| Benefit | Description | Example |
|---------|-------------|---------|
| **Resilience** | Handles temporary failures | Network glitches |
| **Stability** | Prevents cascading failures | Service degradation |
| **Better UX** | Smooth experience despite failures | Auto-reconnect |
| **Resource Management** | Frees up resources | Hanging connections |

## 🛠 Implementation

### 1. Spring Retry with Resilience4j

```java
// 1. Add dependencies (build.gradle)
implementation 'org.springframework.retry:spring-retry'
implementation 'io.github.resilience4j:resilience4j-spring-boot2'
implementation 'org.springframework.boot:spring-boot-starter-aop'

// 2. Enable Retry
@SpringBootApplication
@EnableRetry
public class OrderServiceApplication { ... }

// 3. Apply Retry to a method
@Service
public class PaymentService {
    
    @Retryable(
        value = { ResourceAccessException.class },
        maxAttempts = 3,
        backoff = @Backoff(delay = 1000, multiplier = 2)
    )
    public Payment processPayment(Order order) {
        // External payment service call
        return paymentClient.charge(order);
    }
    
    @Recover
    public Payment processPaymentFallback(Order order, Exception e) {
        // Fallback logic
        return new Payment("FALLBACK", order.getId(), PaymentStatus.FAILED);
    }
}
```

### 2. Timeout with Resilience4j

```java
@Configuration
public class ResilienceConfig {
    
    @Bean
    public TimeLimiterConfig timeLimiterConfig() {
        return TimeLimiterConfig.custom()
            .timeoutDuration(Duration.ofSeconds(2))
            .cancelRunningFuture(true)
            .build();
    }
    
    @Bean
    public TimeLimiter timeLimiter(TimeLimiterConfig config) {
        return TimeLimiter.of("paymentService", config);
    }
}

// Usage with @TimeLimiter
@Service
public class OrderService {
    
    @TimeLimiter(name = "orderService")
    public CompletableFuture<Order> createOrder(Order order) {
        return CompletableFuture.supplyAsync(() -> {
            // Long-running operation
            return orderRepository.save(order);
        });
    }
}
```

## 🔄 Advanced Retry Strategies

### 1. Exponential Backoff with Jitter

```java
@Bean
public RetryTemplate retryTemplate() {
    RetryTemplate retryTemplate = new RetryTemplate();
    
    // Exponential backoff with jitter
    ExponentialBackOffPolicy backOffPolicy = new ExponentialBackOffPolicy();
    backOffPolicy.setInitialInterval(1000);
    backOffPolicy.setMultiplier(2.0);
    backOffPolicy.setMaxInterval(10000);
    
    // Add random jitter
    backOffPolicy.setInitialInterval(1000);
    backOffPolicy.setMultiplier(2.0);
    backOffPolicy.setMaxInterval(10000);
    
    retryTemplate.setBackOffPolicy(backOffPolicy);
    
    // Retry on specific exceptions
    SimpleRetryPolicy retryPolicy = new SimpleRetryPolicy();
    retryPolicy.setMaxAttempts(3);
    
    retryTemplate.setRetryPolicy(retryPolicy);
    return retryTemplate;
}

// Usage
public void processWithRetry() {
    retryTemplate.execute(context -> {
        // Your service call here
        return externalService.call();
    });
}
```

## 🚀 Best Practices

1. **Be Selective with Retries**
   - Only retry idempotent operations
   - Don't retry non-retryable errors (e.g., 4xx errors)

2. **Use Circuit Breaker with Retry**
   - Combine with Circuit Breaker to fail fast when the service is down

3. **Monitor and Alert**
   - Track retry metrics
   - Set up alerts for excessive retries

4. **Progressive Backoff**
   - Use exponential backoff with jitter
   - Start with small delays (e.g., 100ms) and increase exponentially

5. **Timeouts**
   - Always set timeouts for external calls
   - Use aggressive timeouts (e.g., 1-2 seconds for user-facing APIs)

## ⚠️ Common Pitfalls

| Pitfall | Solution |
|---------|----------|
| **Infinite Retries** | Set maximum retry attempts |
| **No Backoff** | Implement exponential backoff |
| **No Jitter** | Add jitter to prevent thundering herd |
| **Retrying Non-Idempotent Operations** | Mark non-idempotent operations |
| **Ignoring Timeouts** | Always set timeouts |

## 📚 Related Patterns

- **Circuit Breaker**: For failing fast when a service is down
- **Bulkhead**: For isolating failures to a subset of resources
- **Fallback**: For providing alternative behavior when retries fail
- **Rate Limiting**: For protecting services from being overwhelmed

## 🔍 Further Reading

- [Resilience4j Documentation](https://resilience4j.readme.io/)
- [Spring Retry Documentation](https://docs.spring.io/spring-batch/docs/current/reference/html/retry.html)
- [Exponential Backoff and Jitter](https://aws.amazon.com/blogs/architecture/exponential-backoff-and-jitter/)
