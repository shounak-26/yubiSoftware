package com.problem.second.controller;

import com.problem.second.model.User;
import com.problem.second.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
@RestController
@RequestMapping("/api/geography-columns")
@CrossOrigin(origins = "http://localhost:3000")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/fetch") // Updated endpoint mapping
    public List<User> fetchData(@RequestBody Map<String, String> requestData) {
        // Extract data from the requestData map (tableName, uniqueColumn, columnName)
        String tableName = requestData.get("tableName");
        String uniqueColumn = requestData.get("uniqueColumn");
        String columnName = requestData.get("columnName");

        // Use the extracted data to fetch and return the relevant data
        // Replace the following line with the actual logic to fetch data based on tableName, uniqueColumn, and columnName
        return userService.getDataByTableNameAndColumnName(tableName, uniqueColumn, columnName);
    }

    @PutMapping("/update")
    public void updateCityNames(@RequestBody List<User> userData) {
        // Assuming userData contains the updated user data with id and new city_name

        for (User user : userData) {
            userService.updateCityName(user.getId(), user.getCity_name());
        }
    }

    // Inner class to represent the request body for fetching data
    public static class FetchDataRequest {
        private String tableName;
        private String uniqueColumn;
        private String columnName;

        // Getters and setters

        public String getTableName() {
            return tableName;
        }

        public void setTableName(String tableName) {
            this.tableName = tableName;
        }

        public String getUniqueColumn() {
            return uniqueColumn;
        }

        public void setUniqueColumn(String uniqueColumn) {
            this.uniqueColumn = uniqueColumn;
        }

        public String getColumnName() {
            return columnName;
        }

        public void setColumnName(String columnName) {
            this.columnName = columnName;
        }
    }
}