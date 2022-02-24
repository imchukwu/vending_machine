package com.cimspace.vending_machine.models;

public class Product {
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

    @Override
    public String toString() {
        return "Product{" +
                "amountAvailable=" + amountAvailable +
                ", cost=" + cost +
                ", productName='" + productName + '\'' +
                ", sellerId='" + sellerId + '\'' +
                '}';
    }
}
