package com.example.DataOperations.controller;

import com.example.DataOperations.model.UserDetails;
import com.example.DataOperations.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/users")
@CrossOrigin(origins = "*")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping
    public UserDetails addUser(@RequestBody UserDetails user) {
        return userRepository.save(user);
    }

    @GetMapping("/{id}")
    public Optional<UserDetails> getUser(@PathVariable Long id) {
        return userRepository.findById(id);
    }
}
