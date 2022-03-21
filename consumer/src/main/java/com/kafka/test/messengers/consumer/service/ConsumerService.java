package com.kafka.test.messengers.consumer.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ConsumerService {

    @KafkaListener(topics = "instagram", groupId = "consumer")
    public void listenInstagramTopic(String message) {
        log.error("Trying to post in instagram: {}. FAILED", message);
    }

    @KafkaListener(topics = "vk", groupId = "consumer")
    public void listenVkTopic(String message) {
        log.info("Trying to post in vk: {}. SUCCESS", message);
    }

}
