package com.example.usermanagement.repository;

import com.example.usermanagement.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Repository
public class UserRepository {
    
    // I want to keep auto increment id for every user
    private Long id = 0L;
    private List<User> users = new ArrayList<>();

    public User addUser(User user) {
        user.setId(++id);
        users.add(user);
        users.sort(Comparator.comparing(User::getName));
        return user;
    }

    public List<User> getAllUsers() {
        return users;
    }

    public User updateUser(Long id, User user) {
        // find user based on given id and replace it with new user. Also, set id for new user.
        user.setId(id);
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getId().equals(id)) {
                users.set(i, user);
                return user;
            }
        }
        return null;
    }

    public void deleteUser(Long id) {
        // find user based on given id and delete it
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getId().equals(id)) {
                users.remove(i);
                break;
            }
        }
    }
}
