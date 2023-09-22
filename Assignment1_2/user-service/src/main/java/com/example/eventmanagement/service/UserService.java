package com.example.usermanagement.service;

import java.util.List;

import com.example.usermanagement.model.User;

public interface UserService {
    public User addUser(User user) throws Exception;

    public List<User> getAllUsers() throws Exception;

    public User updateUser(Long id, User user) throws Exception;

    public String deleteUser(Long id) throws Exception;
}
