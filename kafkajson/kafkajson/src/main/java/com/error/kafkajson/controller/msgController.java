package com.error.kafkajson.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.error.kafkajson.model.Employee;
import com.error.kafkajson.producer.SendProducer;

@RestController
public class msgController {
	@Autowired
	private SendProducer sendproducer;
	
	@PostMapping("/emp")
	public String producer(@RequestBody Employee emp)
	{
		sendproducer.sendMessage(emp);
		return ("message sent to topic");
	}
	
	

}
