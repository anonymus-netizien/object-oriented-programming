package com.java.oop;

import java.math.BigDecimal;


public class Order {
    String orderId;
    String orderDate;
    String status;
    String dispatchDate;
    String expectedDeliveryDate;
    String deliveryAddress;
    BigDecimal orderAmount;

    public Order() {
        orderId = "M895684";
        orderDate = "03/03/2026";
        status = "in transit";
        dispatchDate = "04/03/2026";
        expectedDeliveryDate = "06/03/2026";
        deliveryAddress = "6-58/72, Hyderabad.";
        orderAmount = new BigDecimal(459);
    }

    public Order(String orderId, String orderDate, String status, String dispatchDate, String expectedDeliveryDate, String deliveryAddress, BigDecimal orderAmount) {
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.status = status;
        this.dispatchDate = dispatchDate;
        this.expectedDeliveryDate = expectedDeliveryDate;
        this.deliveryAddress = deliveryAddress;
        this.orderAmount = orderAmount;
    }
}
