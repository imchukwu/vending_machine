package com.cimspace.vending_machine.models;

public class User {
    private String username;
    private String password;
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

    public int getDeposit() {
        return deposit;
    }

    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }
}
