package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1/user")
@RestController
public class UserInfoController {

    @GetMapping
    public ResponseEntity<?> getUserId() {
        String userId = "82265615";
        return ResponseEntity.ok(userId);
    }

}
