package com.problem.second.service;

import com.problem.second.model.User;
import com.problem.second.repository.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> getDataByTableNameAndColumnName(String tableName, String uniqueColumn, String columnName) {
        // Implement logic to fetch data based on provided parameters
        // For simplicity, returning all data here
        return userRepository.findAll();
    }

    public void updateCityName(Long id, String newCityName) {
        User user = userRepository.findById(id).orElse(null);
        if (user != null) {
            user.setCity_name(newCityName);
            userRepository.save(user);
        }
    }
}
