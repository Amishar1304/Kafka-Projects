package com.KafkaJson.kafkawithjson.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.KafkaJson.kafkawithjson.payload.User;



@Service
public class JsonKafkaConsumer {
	private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaConsumer.class);
	
	@KafkaListener(topics ="Kafka_Topics", groupId = "myGroup")
	public void consume(User user)
	{
	   LOGGER.info(String.format("Message Received -> %s", user.toString()));
		
		
	}
	
	
	

}
