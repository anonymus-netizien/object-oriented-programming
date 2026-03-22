package com.java.oop.abstraction;

public class RegularCustomer extends Customer {
    //Argument Constructor extended from super class
    public RegularCustomer(String customerId, String name, String email, long phoneNumber, String joinDate) {
        super(customerId, name, email, phoneNumber, joinDate);
    }

    @Override
    String getDeliveryType() {
        return "Standard Delivery (3-5 days)";
    }

    @Override
    double getDeliveryCharge(double orderAmount) {
        return 50.0; //Standard delivery charge
    }


}
