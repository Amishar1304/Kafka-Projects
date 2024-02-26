package com.yahoo.springconsumer.consumer;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.yahoo.springconsumer.entity.Child;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ChildConsumer {



    @KafkaListener(topics = "Kafka_Topics", groupId = "myGroup")
    public void read(Child child) {
    	System.out.println(child);
    }
}
