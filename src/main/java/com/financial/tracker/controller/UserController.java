package com.financial.tracker.controller;

import com.financial.tracker.entity.UserEntity;
import com.financial.tracker.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public UserEntity createEntity(@RequestBody UserEntity user) {
        return userService.saveUser(user);
    }

    @GetMapping
    public List<UserEntity> getAllEntities() {
        return userService.getAllUsers();
    }

}
