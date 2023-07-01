package com.example.kafkaexample.kafka.configuration;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfiguration {
    @Value(value = "${topic.demo}")
    private String demoTopic;

    @Bean
    public NewTopic getTopic() {
        return TopicBuilder.name(demoTopic).build();
    }
}
