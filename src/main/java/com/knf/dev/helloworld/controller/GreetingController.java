package com.knf.dev.helloworld.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class GreetingController {

    @GetMapping("greeting")
    public String greeting() {

        return "Hello, world! Greeting from Azure";
    }
}