package com.example.usermanagementservice.service;

import com.example.usermanagementservice.dto.UserDTO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class UserServiceTest {

    private UserService userService;

    @BeforeEach
    void setUp() {
        userService = new UserService();
    }

    @Test
    void testGetAllUsers() {
        List<UserDTO> users = userService.getAllUsers();
        assertEquals(2, users.size());
    }

    @Test
    void testGetUserById() {
        UserDTO user = userService.getUserById(1L);
        assertNotNull(user);
        assertEquals("Alice", user.getName());
    }

    @Test
    void testAddUser() {
        UserDTO newUser = new UserDTO(3L, "Charlie", "charlie@example.com");
        userService.addUser(newUser);

        UserDTO fetchedUser = userService.getUserById(3L);
        assertNotNull(fetchedUser);
        assertEquals("Charlie", fetchedUser.getName());
    }
}
