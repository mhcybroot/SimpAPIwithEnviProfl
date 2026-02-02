package com.example.SimpAPIwithEnviProfl.controller;

import com.example.SimpAPIwithEnviProfl.service.WelcomeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class StatusController {

    private final WelcomeService welcomeService;

    public StatusController(WelcomeService welcomeService) {
        this.welcomeService = welcomeService;
    }

    @GetMapping("/status")
    public Map<String, String> getStatus() {
        Map<String, String> response = new HashMap<>();
        response.put("message", welcomeService.getMessage());
        response.put("apiUrl", welcomeService.getApiUrl());
        return response;
    }
}
