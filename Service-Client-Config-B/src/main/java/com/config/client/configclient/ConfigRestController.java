package com.config.client.configclient;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/config")
public class ConfigRestController {

    @Value("${message}")
    String message;

    @GetMapping("/printConfig")
    private String printConfiguration() {
        return message;
    }
}
