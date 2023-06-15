package com.example.authdemo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.authdemo.authRepo;
import com.example.authdemo.Model.loginmodel;
import com.example.authdemo.Model.user;

@RestController
public class authController {
    @Autowired
    authRepo repo;

    @GetMapping("/")
    public String start() {

        return "APlication started";
    }

    @PostMapping("/auth/register")
    public String register(@RequestBody user u) {
        // store user in db
        repo.insert(u);

        return "Registered user Successfully";

    }

    @PostMapping("/auth/login")
    public String login(@RequestBody loginmodel login) {

        return "Login user Successfully";
    }
}
