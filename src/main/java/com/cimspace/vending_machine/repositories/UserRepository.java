package com.cimspace.vending_machine.repositories;

import com.cimspace.vending_machine.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
