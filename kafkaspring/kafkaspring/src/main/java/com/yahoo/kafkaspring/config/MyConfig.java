package com.yahoo.kafkaspring.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class MyConfig {
	@Bean
	public NewTopic KTopic()
	{
		return TopicBuilder.name("Kafka_Topics")
				.build();
				
		
		
	}
	
	
	

}



