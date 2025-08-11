package com.example.uber_consumer.kafka;

import com.example.uber_consumer.dto.RideMessage;
import com.example.uber_consumer.entity.Ride;
import com.example.uber_consumer.repository.RideRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class RideListener {

    private final RideRepository repo;
    private final ObjectMapper mapper = new ObjectMapper();

    public RideListener(RideRepository repo) {
        this.repo = repo;
    }

    @KafkaListener(topics = "${app.topic.name}", groupId = "${spring.kafka.consumer.group-id}")
    @Transactional
    public void listen(String message) {
        try {
            RideMessage rm = mapper.readValue(message, RideMessage.class);
            String op = rm.getOperation();
            if (op == null) return;
            switch (op.toUpperCase()) {
                case "CREATE":
                    Ride r = toEntity(rm);
                    repo.save(r);
                    break;
                case "UPDATE":
                    repo.findById(rm.getId()).ifPresent(existing -> {
                        existing.setDriverName(rm.getDriverName());
                        existing.setPassengerName(rm.getPassengerName());
                        existing.setPickupLocation(rm.getPickupLocation());
                        existing.setDropLocation(rm.getDropLocation());
                        existing.setFare(rm.getFare());
                        repo.save(existing);
                    });
                    break;
                case "DELETE":
                    repo.deleteById(rm.getId());
                    break;
                default:
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private Ride toEntity(RideMessage rm) {
        Ride r = new Ride();
        r.setId(rm.getId());
        r.setDriverName(rm.getDriverName());
        r.setPassengerName(rm.getPassengerName());
        r.setPickupLocation(rm.getPickupLocation());
        r.setDropLocation(rm.getDropLocation());
        r.setFare(rm.getFare());
        return r;
    }
}
