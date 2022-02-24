package com.cimspace.vending_machine.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "\"user\"")
public class User {
    @Id
    @Column(nullable = false, updatable = false)
    private String username;

    @Column
    private String password;

    @Column
    private int deposit;

    enum role {
        SELLER,
        BUYER
    }

    public User(){
    }

    public User(String username, String password, int deposit) {
        this.username = username;
        this.password = password;
        this.deposit = deposit;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }
}
