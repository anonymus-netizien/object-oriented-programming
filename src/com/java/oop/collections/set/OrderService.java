package com.java.oop.collections.set;

import com.java.oop.model.Order;

public class OrderService {
    public void displayOrderDetails(Order order) {
        System.out.println("Order Details:");
        System.out.println("Order ID: " + order.getOrderId());
        System.out.println("Order Date: " + order.getOrderDate());
        System.out.println("Order Status: " + order.getStatus());
        System.out.println("Dispatch Date: " + order.getDispatchDate());
        System.out.println("Expected Delivery Date: " + order.getExpectedDeliveryDate());
        System.out.println("Delivery Address: " + order.getDeliveryAddress());
        System.out.println("Order Amount: " + order.getOrderAmount());
        System.out.println();
    }


}
