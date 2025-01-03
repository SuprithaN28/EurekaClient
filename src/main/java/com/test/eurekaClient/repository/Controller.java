package com.test.eurekaClient.repository;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/message")
    public String getMessage(){
        return "Hello from Service";
    }
}
