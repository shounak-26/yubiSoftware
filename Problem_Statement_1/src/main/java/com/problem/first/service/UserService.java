package com.problem.first.service;

import com.problem.first.model.User;
import com.problem.first.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public Optional<User> retrieveUserById(Long id) {
        return userRepository.findById(id);
    }

    public User updateUserById(Long userId, User updatedUser) {
        if (userRepository.existsById(userId)) {
            updatedUser.setId(userId);
            return userRepository.save(updatedUser);
        }
        return null;
    }

    public void deleteUserById(Long userId) {
        userRepository.deleteById(userId);
    }
}
