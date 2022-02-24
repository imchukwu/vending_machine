package com.cimspace.vending_machine.entities;

public class Product {
    private String productId;
    private int amountAvailable;
    private int cost;
    private String productName;
    private String sellerId;

    public Product(){
    }

    public Product(int amountAvailable, int cost, String productName, String sellerId) {
        this.amountAvailable = amountAvailable;
        this.cost = cost;
        this.productName = productName;
        this.sellerId = sellerId;
    }

    public Product(String productId, int amountAvailable, int cost, String productName, String sellerId) {
        this.productId = productId;
        this.amountAvailable = amountAvailable;
        this.cost = cost;
        this.productName = productName;
        this.sellerId = sellerId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public double getAmountAvailable() {
        return amountAvailable;
    }

    public void setAmountAvailable(int amountAvailable) {
        this.amountAvailable = amountAvailable;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getSellerId() {
        return sellerId;
    }

    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
    }

}
