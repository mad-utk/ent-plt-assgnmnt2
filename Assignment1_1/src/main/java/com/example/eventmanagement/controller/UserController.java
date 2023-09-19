package com.example.eventmanagement.controller;

import com.example.eventmanagement.model.User;
import com.example.eventmanagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/user")
    public User addUser(@RequestBody User user) throws Exception {
        return userService.addUser(user);
    }

    @GetMapping("/users")
    public List<User> getAllUsers() throws Exception {
        return userService.getAllUsers();
    }

    // endpoint for updating user by id
    @PutMapping("/user/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody User user) throws Exception {
        return userService.updateUser(id, user);
    }

    // endpoint for deleting user by id
    @DeleteMapping("/user/{id}")
    public String deleteUser(@PathVariable Long id) throws Exception {
        return userService.deleteUser(id);
    }
}
