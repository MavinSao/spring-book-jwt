package com.kshrd.jpajwtdemo.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class BookController {
    @GetMapping("/books")
    public ResponseEntity<?> getBook(){
        return ResponseEntity.ok().body(new Book("Love You 3000"));
    }
}

@Data
@AllArgsConstructor
class Book {
    private String title;
}