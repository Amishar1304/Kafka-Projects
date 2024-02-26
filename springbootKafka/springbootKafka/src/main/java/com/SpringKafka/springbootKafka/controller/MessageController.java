package com.SpringKafka.springbootKafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.SpringKafka.springbootKafka.producer.KafkaProducer;

@RestController
//@RequestMapping("/api/kafka")
public class MessageController {
	
	@Autowired
	private KafkaProducer kafkaproducer;
	
	//either use  autowird or constructor(choise is urs)
//	public MessageController(KafkaProducer kafkaproducer) {
//		super();
//		this.kafkaproducer = kafkaproducer;
//	}
	
	//http://localhost:8080/api/kafka/publish?message = hello world
	//@GetMapping("/publish")
//	public ResponseEntity<String> publish(@RequestParam("message") String message)
//	{
//		kafkaproducer.sendMessage(message);
//		return ResponseEntity.ok("Message sent to the topic");
//		
//	}
	
	@GetMapping("/{message}")
	public String publish(@PathVariable String message) {
		System.out.println("hello");
		kafkaproducer.sendMessage(message);
		return ("message sent to topic");
	}
	
	

	
	
	
	
	

}