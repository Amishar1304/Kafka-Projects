package com.SpringKafka.springbootKafka.producer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {
	
	//private static final Logger logger = LoggerFactory.getLogger(KafkaProducer.class);
	
	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;

//	public KafkaProducer(KafkaTemplate<String, String> kafkaTemplate) {
//		this.kafkaTemplate = kafkaTemplate;
//	}
	
	public void sendMessage(String message) {
	//	logger.info(String.format("Producing message: %s", message));
		kafkaTemplate.send("KTopics", message);
	}

}