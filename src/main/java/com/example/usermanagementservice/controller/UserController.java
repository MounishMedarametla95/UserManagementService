package com.example.usermanagementservice.controller;

import com.example.usermanagementservice.dto.UserDTO;
import com.example.usermanagementservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<UserDTO> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public UserDTO getUserById(@PathVariable long id) {
        return userService.getUserById(id);
    }

    @PostMapping
    public String addUser(@RequestBody UserDTO user) {
        userService.addUser(user);
        return "User added Successfully";
    }

}
