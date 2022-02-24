package com.cimspace.vending_machine.services;

import com.cimspace.vending_machine.models.User;
import com.cimspace.vending_machine.repositories.UserRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> findAll() {
        return userRepository.findAll()
                .stream()
                .map(user -> mapToDTO(user, new User()))
                .collect(Collectors.toList());
    }

    public User get(final String userId) {
        return userRepository.findById(userId)
                .map(user -> mapToDTO(user, new User()))
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    public String create(final User userDTO) {
        final User user = new User();
        mapToEntity(userDTO, user);
        return userRepository.save(user).getUsername();
    }

    public void update(final String userId, final User userDTO) {
        final User user = userRepository.findById(userId)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        mapToEntity(userDTO, user);
        userRepository.save(user);
    }

    public void delete(final String userId) {
        userRepository.deleteById(userId);
    }

    private User mapToDTO(final User user, final User userDTO) {
        userDTO.setUsername(user.getUsername());
        userDTO.setPassword(user.getPassword());
        userDTO.setDeposit(user.getDeposit());
        return userDTO;
    }

    private User mapToEntity(final User userDTO, final User user) {
        user.setUsername(userDTO.getUsername());
        user.setPassword(userDTO.getPassword());
        userDTO.setDeposit(user.getDeposit());
        return user;
    }

}
