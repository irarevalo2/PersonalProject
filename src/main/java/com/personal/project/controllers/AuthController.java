package com.personal.project.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @GetMapping("/hi")
    public String sayHello() {
        return "Hola amor te extraño :(";
    }
}
