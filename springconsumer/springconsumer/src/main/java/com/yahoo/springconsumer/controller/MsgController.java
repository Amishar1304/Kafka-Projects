//package com.yahoo.springconsumer.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.yahoo.springconsumer.entity.Child;
//import com.yahoo.springconsumer.producer.ChildProducer;
//
//@RestController
//public class MsgController {
//	@Autowired
//	private ChildProducer childproducer;
//	
//	@PostMapping("/child")
//	public String producer(@RequestBody Child child)
//	{
//		childproducer.sendMessage(child);
//		return ("message sent to topic");
//	}
//	
//	
//	
//
//}
