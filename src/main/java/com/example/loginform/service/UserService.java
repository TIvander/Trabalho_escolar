package com.example.loginform.service;

import com.example.loginform.domain.User;
import com.example.loginform.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository repo;

    public User login(String username, String password) {
        User user = repo.findByUsernameAndPassword(username, password);
        return user;
    }
}
