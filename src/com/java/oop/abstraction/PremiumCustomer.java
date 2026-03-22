package com.java.oop.abstraction;

public class PremiumCustomer extends Customer {
    //Argument Constructor extended from super class
    public PremiumCustomer(String customerId, String name, String email, long phoneNumber, String joinDate) {
        super(customerId, name, email, phoneNumber, joinDate);
    }

    @Override
    String getDeliveryType() {
        return "Express Delivery (1-2 days)";
    }

    @Override
    double getDeliveryCharge(double orderAmount) {
        return 0.0; //free delivery
    }

}
