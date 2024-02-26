package com.error.kafkajson.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.error.kafkajson.model.Employee;

@Service
public class ReadConsumer {

	@KafkaListener(topics = "Kafka_Topics", groupId = "myGroup")
	public void consume (Employee emp)
	{
		System.out.println(emp.toString());
		
		
	}
}