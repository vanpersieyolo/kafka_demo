package com.example.kafkaexample.service;

import com.example.kafkaexample.dto.MessageRequest;
import com.fasterxml.jackson.core.JsonProcessingException;

public interface MessageService {
    String createMessage(MessageRequest message) throws JsonProcessingException;
}
