package com.java.oop.abstraction;


public abstract class Customer {
    String customerId;
    String name;
    String email;
    long phoneNumber;
    String joinDate;

    Customer(String customerId, String name, String email, long phoneNumber, String joinDate) {
        this.customerId = customerId;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.joinDate = joinDate;
    }

    abstract String getDeliveryType();
    abstract double getDeliveryCharge(double orderAmount);

}
