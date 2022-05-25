package com.testinium.west.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value="east",url="http://localhost:8080/api")
public interface MessageService {
    @GetMapping("/getMessage")
    String getEastMessage();
}
