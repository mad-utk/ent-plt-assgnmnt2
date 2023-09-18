package com.example.eventmanagement.service.impl;

import com.example.eventmanagement.model.User;
import com.example.eventmanagement.repository.UserRepository;
import com.example.eventmanagement.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    public User addUser(User user) throws Exception {
        // handle exception if any exception occurs
        try {
            return userRepository.addUser(user);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            // throws exception
            throw e;
        }
    }

    public List<User> getAllUsers() throws Exception {
        // handle exception if any exception occurs
        try {
            return userRepository.getAllUsers();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            // throws exception
            throw e;
        }
    }

    public User updateUser(Long id, User user) throws Exception {
        // handle exception if any exception occurs
        try {
            return userRepository.updateUser(id, user);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            // throws exception
            throw e;
        }
    }

    public String deleteUser(Long id) throws Exception {
        // handle exception if any exception occurs
        // return string "User deleted successfully" if user is deleted successfully
        try {
            userRepository.deleteUser(id);
            return "User deleted successfully";
        } catch (Exception e) {
            System.out.println(e.getMessage());
            // throws exception
            throw e;
        }
    }
}
