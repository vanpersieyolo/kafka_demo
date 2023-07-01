package com.example.kafkaexample.controller;

import com.example.kafkaexample.dto.MessageRequest;
import com.example.kafkaexample.service.MessageService;
import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/demo")
public class MessageController {
    private final MessageService messageService;

    @PostMapping
    public ResponseEntity<?> createMessage(@RequestBody MessageRequest messageRequest) throws JsonProcessingException {
        return new ResponseEntity<>(messageService.createMessage(messageRequest), HttpStatus.CREATED);
    }
}
