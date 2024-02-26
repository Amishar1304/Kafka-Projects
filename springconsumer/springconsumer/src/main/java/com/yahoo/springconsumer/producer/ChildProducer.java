//package com.yahoo.springconsumer.producer;
//
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.kafka.core.KafkaTemplate;
//import org.springframework.kafka.support.KafkaHeaders;
//import org.springframework.messaging.Message;
//import org.springframework.messaging.support.MessageBuilder;
//import org.springframework.stereotype.Service;
//
//import com.yahoo.springconsumer.entity.Child;
//
//@Service
//public class ChildProducer {
//	
//	@Autowired
//	private KafkaTemplate<String, Child> kafkaTemplate;
//	
//	public void sendMessage(Child child)
//	{
//		Message<Child> message = MessageBuilder
//				.withPayload(child)
//				.setHeader(KafkaHeaders.TOPIC,"Kafka_Topics")
//				.build();
//		
//		kafkaTemplate.send(message);
//		}
//	
//
//}
