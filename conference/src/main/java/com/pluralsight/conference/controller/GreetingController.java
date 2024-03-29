package com.pluralsight.conference.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class GreetingController {

    @GetMapping("/greeting")
    public String getGreeting(Map<String, Object> model) {
        model.put("message", "Greeting Hi Adamo");
        return "greeting";
    }
}
