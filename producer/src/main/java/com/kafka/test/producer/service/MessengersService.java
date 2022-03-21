package com.kafka.test.producer.service;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MessengersService {

    private final KafkaTemplate<String, String> kafkaTemplateString;

    public void post(String topicName, String text) {
        kafkaTemplateString.send(topicName, text);
    }

    public String postAndGetSync(String topicName, String text) {
        var future = kafkaTemplateString.send(topicName, text);
        try {
            var result = future.get();
            return result.getRecordMetadata().topic();
        } catch (Exception e) {
            return "U a trouble trouble";
        }
    }

}
