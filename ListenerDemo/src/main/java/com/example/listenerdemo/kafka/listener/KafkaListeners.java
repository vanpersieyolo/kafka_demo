package com.example.listenerdemo.kafka.listener;

import com.example.listenerdemo.entity.MessageEntity;
import com.example.listenerdemo.repository.MessageRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@RequiredArgsConstructor
public class KafkaListeners {
    private final MessageRepository messageRepository;


    @KafkaListener(topics = "demo", groupId = "group-id")
    public void listen(@Payload String message,
                       @Header(KafkaHeaders.RECEIVED_PARTITION) int partition,
                       @Header(KafkaHeaders.GROUP_ID) String groupId) {
        log.info("Received Message: " + message + " from partition: " + partition + " of groupId: " + groupId);
        MessageEntity entity = MessageEntity.builder()
                .content(message)
                .build();
        messageRepository.save(entity);
    }
}
