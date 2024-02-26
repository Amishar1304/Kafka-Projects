package com.KafkaJson.kafkawithjson.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.KafkaJson.kafkawithjson.kafka.JsonKafkaProducer;
import com.KafkaJson.kafkawithjson.payload.User;

@RestController
public class JsonMessageController {
	
	private JsonKafkaProducer kafkaproducer;

	public JsonMessageController(JsonKafkaProducer kafkaproducer) {
		super();
		this.kafkaproducer = kafkaproducer;
	}
	
	@PostMapping("/publish")
	public String publish(@RequestBody User user)
	{
		kafkaproducer.sendMessage(user);
		return ("Json Message sent to the kafka topic");
		
	}
	

}
