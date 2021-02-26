package com.example.hustle.controller;

import com.example.hustle.document.User;
import com.example.hustle.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class UserController {

    @Autowired
    private UserServiceImpl mongoDBSignUpService;

    @PostMapping("/createUser")
    public User createUser(@RequestBody User signUp ) {
        return mongoDBSignUpService.create(signUp);
    }

}