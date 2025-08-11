package com.example.uber_producer.controller;

import com.example.uber_producer.dto.RideMessage;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rides")
public class RideController {

    private final KafkaTemplate<String, String> kafkaTemplate;
    private final ObjectMapper objectMapper;
    private final String topic;

    public RideController(KafkaTemplate<String, String> kafkaTemplate,
                          ObjectMapper objectMapper,
                          @Value("${app.topic.name}") String topic) {
        this.kafkaTemplate = kafkaTemplate;
        this.objectMapper = objectMapper;
        this.topic = topic;
    }

    @PostMapping
    public ResponseEntity<String> createRide(@RequestBody RideMessage message) throws Exception {
        message.setOperation("CREATE");
        String json = objectMapper.writeValueAsString(message);
        kafkaTemplate.send(topic, json);
        return ResponseEntity.accepted().body("CREATE sent");
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateRide(@PathVariable Long id, @RequestBody RideMessage message) throws Exception {
        message.setOperation("UPDATE");
        message.setId(id);
        String json = objectMapper.writeValueAsString(message);
        kafkaTemplate.send(topic, json);
        return ResponseEntity.accepted().body("UPDATE sent");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteRide(@PathVariable Long id) throws Exception {
        RideMessage m = new RideMessage();
        m.setOperation("DELETE");
        m.setId(id);
        String json = objectMapper.writeValueAsString(m);
        kafkaTemplate.send(topic, json);
        return ResponseEntity.accepted().body("DELETE sent");
    }

    @GetMapping("/{id}")
    public ResponseEntity<String> getMock(@PathVariable Long id) {
        return ResponseEntity.ok("Producer acknowledges id=" + id);
    }
}
