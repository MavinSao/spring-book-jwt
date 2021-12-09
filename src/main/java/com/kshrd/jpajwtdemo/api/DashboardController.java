package com.kshrd.jpajwtdemo.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DashboardController {
    @GetMapping("/dashboard")
    public ResponseEntity<?> dashboard(){
        return ResponseEntity.ok().build();
    }
}
