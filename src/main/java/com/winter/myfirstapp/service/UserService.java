package com.winter.myfirstapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.winter.myfirstapp.model.User;
import com.winter.myfirstapp.repository.UserRepository;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // Get all users
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // Get a user by ID
    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    // Create a new user
    public User createUser(User user) {
        return userRepository.save(user);
    }
}
