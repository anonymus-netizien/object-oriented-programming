package com.java.oop.abstraction;

public class CustomerService {

    void processDelivery(Customer customer, double orderAmount) {
        System.out.println("Customer: " + customer.name);

        String type = customer.getDeliveryType();
        double charge = customer.getDeliveryCharge(orderAmount);

        System.out.println("Delivery type: " + type);
        System.out.println("Order amount: ₹" + orderAmount);
        System.out.println("Delivery charge: " + charge);
        System.out.println();
    }
}
