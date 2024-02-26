package com.error.kafkajson.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import com.error.kafkajson.model.Employee;

@Service
public class SendProducer {
	
	@Autowired
	private KafkaTemplate<String, Employee> kafkaTemplate;
	
	public void sendMessage(Employee emp)
	{
		Message<Employee> message = MessageBuilder
				.withPayload(emp)
				.setHeader(KafkaHeaders.TOPIC,"Kafka_Topics")
				.build();
		
		kafkaTemplate.send(message);
		}
	
	
	
	
	
	

}
