package com.kafka.test.messengers.consumer.model;

import lombok.Data;

@Data
public class MessengerDto {

    private String messenger;
    private String text;
}
