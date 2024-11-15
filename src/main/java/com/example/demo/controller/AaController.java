package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AaController {

    @GetMapping("/api/v1/user")
    public String user() {
    	return "82265615";
    }

}
