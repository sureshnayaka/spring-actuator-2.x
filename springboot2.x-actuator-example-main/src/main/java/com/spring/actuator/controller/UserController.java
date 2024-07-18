package com.spring.actuator.controller;

import com.spring.actuator.dao.UserDatabase;
import com.spring.actuator.dto.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserDatabase database;

    @GetMapping("/loadUsers")
    public List<User>  getUsers(){
        return database.getAllUsers();
    }


}
