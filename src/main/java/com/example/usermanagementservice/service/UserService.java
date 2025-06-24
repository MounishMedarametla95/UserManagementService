package com.example.usermanagementservice.service;

import org.springframework.stereotype.Service;

import com.example.usermanagementservice.dto.UserDTO;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    private List<UserDTO> users = new ArrayList<>();

    public UserService(){
        users.add(new UserDTO(1L, "Alice", "alice@example.com"));
        users.add(new UserDTO(2L, "Bob", "bob@example.com"));
    }

    public List<UserDTO> getAllUsers() {
        return users;
    }

    public UserDTO getUserById(Long id) {
        return users.stream().filter(user -> user.getId().equals(id)).findFirst().orElse(null);
    }

    public void addUser(UserDTO user) {
        users.add(user);
    }
}
