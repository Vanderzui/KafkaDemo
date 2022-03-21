package com.kafka.test.producer.controller;

import com.kafka.test.producer.model.MessengerDto;
import com.kafka.test.producer.service.MessengersService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/messengers")
@RequiredArgsConstructor
public class MessengersController {

    private final MessengersService service;

    @PostMapping
    public void createPost(@RequestBody MessengerDto request) {
        service.post(request.getMessenger(), request.getText());
    }

    @PostMapping("/sync")
    public String createPostAndGetAnswer(@RequestBody MessengerDto request) {
        return service.postAndGetSync(request.getMessenger(), request.getText());
    }

}
