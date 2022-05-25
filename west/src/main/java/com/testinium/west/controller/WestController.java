package com.testinium.west.controller;

import com.testinium.west.service.MessageService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class WestController {
    private final MessageService messageService;

    public WestController(MessageService messageService) {
        this.messageService = messageService;
    }

    @GetMapping("/getMessage")
    public String getMessage(){
        return "Message From West-Microservice: Hello Baby !";
    }
    @GetMapping("/getEastMessage")
    public String getEastMessage(){
       return messageService.getEastMessage();
    }
}
