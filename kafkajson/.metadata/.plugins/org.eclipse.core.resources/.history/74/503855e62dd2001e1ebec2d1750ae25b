package com.error.kafkajson.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.boot.autoconfigure.info.ProjectInfoProperties.Build;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaJsonConfig {
	@Bean
	public NewTopic KTopic()
	{
		return TopicBuilder.name("Kafka_Topics")
				.build();
				
		
		
	}
	
	
	

}
