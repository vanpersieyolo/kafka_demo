package com.example.kafkaexample.repository;

import com.example.kafkaexample.entity.MessageEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<MessageEntity,Long> {
}
