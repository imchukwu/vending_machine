package com.cimspace.vending_machine.controllers;

import com.cimspace.vending_machine.models.User;
import com.cimspace.vending_machine.services.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/api/users", produces = MediaType.APPLICATION_JSON_VALUE)
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public ResponseEntity<List<User>> getAllUsers() {
        return ResponseEntity.ok(userService.findAll());
    }

    @GetMapping("/{username}")
    public ResponseEntity<User> getUser(@PathVariable final String userId) {
        return ResponseEntity.ok(userService.get(userId));
    }

    @PostMapping
    public ResponseEntity<Void> createUser(@RequestBody @Valid final User user) {
        userService.create(user);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping("/{username}")
    public ResponseEntity<Void> updateUser(@PathVariable final String userId,
                                           @RequestBody @Valid final User user) {
        userService.update(userId, user);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{username}")
    public ResponseEntity<Void> deleteUser(@PathVariable final String userId) {
        userService.delete(userId);
        return ResponseEntity.noContent().build();
    }

}
