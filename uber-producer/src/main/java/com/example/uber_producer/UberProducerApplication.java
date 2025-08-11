package com.example.uber_producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UberProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(UberProducerApplication.class, args);
	}

}


//.\bin\windows\kafka-topics.bat --create --topic uber-ride-topic --bootstrap-server localhost:9092 --partitions 1 --replication-factor 1
//POST http://localhost:8081/rides
//PUT http://localhost:8081/rides/1
//DELETE http://localhost:8081/rides/1
//GET http://localhost:8082/rides
//GET http://localhost:8082/rides/1
//kafka-console-producer.bat --broker-list localhost:9092 --topic uber-ride-topic
//kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic uber-ride-topic --from-beginning