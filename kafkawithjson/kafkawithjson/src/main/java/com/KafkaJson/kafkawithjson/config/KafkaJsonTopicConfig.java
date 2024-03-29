package com.KafkaJson.kafkawithjson.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaJsonTopicConfig {
	@Bean
	public NewTopic KTopic()
	{
		return TopicBuilder.name("Kafka_Topics")
				.build();
				
	}

}
