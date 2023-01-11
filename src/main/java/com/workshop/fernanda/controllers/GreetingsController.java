package com.workshop.fernanda.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Fernanda S.
 */

@RestController
@RequestMapping("/api/v1/greetings")
public class GreetingsController {

    @GetMapping
    public ResponseEntity<String> sayHello(){
        return ResponseEntity.ok("Hello! diz a API! :) ");
    }

    @GetMapping("/say-good-bye")
    public  ResponseEntity<String> sayGoodbye() {
        return ResponseEntity.ok("Goodbye! Até Logo :) ");
    }
}
