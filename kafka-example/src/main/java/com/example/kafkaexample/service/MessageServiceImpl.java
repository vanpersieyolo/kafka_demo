package com.example.kafkaexample.service;

import com.example.kafkaexample.kafka.configuration.KafkaConfiguration;
import com.example.kafkaexample.dto.MessageRequest;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

@Service
@Slf4j
@RequiredArgsConstructor
public class MessageServiceImpl implements MessageService {
    private final KafkaConfiguration kafkaConfiguration;
    private final KafkaTemplate<String, String> kafkaTemplate;

    @Override
    public String createMessage(MessageRequest messageContent) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            String reqJson = mapper.writeValueAsString(messageContent);
            CompletableFuture<SendResult<String,String>> result = kafkaTemplate.send(kafkaConfiguration.getTopic().name(), reqJson);
            log.info("result: ---> {}", result);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return "Sent";
    }
}
