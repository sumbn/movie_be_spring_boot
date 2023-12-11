package com.summerbn.movies_be_spring.controller;

import com.summerbn.movies_be_spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("")
    public ResponseEntity<?> getListUser(){

        return ResponseEntity.ok(userService.getListUser());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getUserById(@PathVariable Long id){
        return ResponseEntity.ok(userService.getUserById(id));
    }

    @PostMapping
    public ResponseEntity<?> createUser(){
        return null;
    }

    @PutMapping
    public ResponseEntity<?> updateUser(){
        return null;
    }
}
