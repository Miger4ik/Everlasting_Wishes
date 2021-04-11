package com.example.everlasting_wishes.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class EverlastingWishesRestController {

    @GetMapping("/")
    public String showHello() {
        return "Hello World";
    }

}
