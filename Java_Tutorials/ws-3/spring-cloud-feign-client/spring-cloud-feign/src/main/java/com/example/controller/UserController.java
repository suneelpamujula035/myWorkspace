package com.example.controller;

import com.example.entity.Root;
import com.example.client.UserClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserClient userClient;

    @GetMapping("/findAllUsers")
    public List<Root> getAllUsers()
    {
        return userClient.getAllUsers();
    }
}
