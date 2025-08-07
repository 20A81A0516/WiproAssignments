package com.example.circuitbreaker.service;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class DeliveryService {

    private final WebClient webClient;

    public DeliveryService(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl("http://localhost:8081").build();
    }

    @CircuitBreaker(name = "deliveryService", fallbackMethod = "fallbackDeliveryStatus")
    public String getDeliveryStatus() {
        return webClient.get()
                .uri("/delivery/status")
                .retrieve()
                .bodyToMono(String.class)
                .block();  // blocking to simplify
    }

    public String fallbackDeliveryStatus(Throwable throwable) {
        return "Delivery service unavailable. Please try later.";
    }
}
