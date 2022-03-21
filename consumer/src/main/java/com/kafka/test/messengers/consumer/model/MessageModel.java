package com.kafka.test.messengers.consumer.model;

import lombok.Data;

@Data
public class MessageModel {

    private String messenger;
    private String text;

}
