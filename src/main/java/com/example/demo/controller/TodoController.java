package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController {

    @GetMapping("/")
    public String home() {
        return "todoList";
    }
    
    @GetMapping("/api/v1/user")
    public String user() {
    	return "82265615";
    }

}
