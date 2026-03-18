package com.java.oop.strings;

import java.math.BigDecimal;

public class Order {
    String orderId;
    String orderDate;
    String status;
    String dispatchDate;
    String expectedDeliveryDate;
    String deliveryAddress;
    BigDecimal orderAmount;

    public Order(String orderId, String orderDate, String status, String dispatchDate, String expectedDeliveryDate, String deliveryAddress, BigDecimal orderAmount) {
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.status = status;
        this.dispatchDate = dispatchDate;
        this.expectedDeliveryDate = expectedDeliveryDate;
        this.deliveryAddress = deliveryAddress;
        this.orderAmount = orderAmount;
    }

    public void displayOrderDetails() {
        System.out.println("-------------------------------------------------------------------------------------------------------------- ");
        System.out.printf("%-10s %-13s %-15s %-15s %-15s %-20s %-50s \n", orderId, orderDate,"₹" + orderAmount, status, dispatchDate, expectedDeliveryDate, deliveryAddress);
    }
}
