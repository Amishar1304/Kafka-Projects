package com.yahoo.kafkaspring.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class YouConsumer {
	
	 @KafkaListener(topics = "Kafka_Topics", groupId = "myGroup")
	    public void listen(String message) {
	        System.out.println("Received message: " + message);

}
}
