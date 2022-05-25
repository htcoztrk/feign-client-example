package com.testinium.east.controller;

import com.testinium.east.service.MessageService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class EastController {
    private final MessageService messageService;

    public EastController(MessageService messageService) {
        this.messageService = messageService;
    }


    @GetMapping("/getWestMessage")
    public String getWestMessage(){
        return messageService.getWestMessage();
    }

    @GetMapping("/getMessage")
    public String getMessage(){
        return "Message From East-Microservice: Merhaba Babo !";
    }
}
