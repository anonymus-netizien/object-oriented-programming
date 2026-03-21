package com.java.oop.model;

import java.math.BigDecimal;
import java.util.Objects;

public class Order implements Comparable<Order> {
    private String orderId;
    private String orderDate;
    private String status;
    private String dispatchDate;
    private String expectedDeliveryDate;
    private String deliveryAddress;
    private BigDecimal orderAmount;

    public Order() {
    }

    public String getOrderId() {
        return orderId;
    }

    public Order setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public Order setOrderDate(String orderDate) {
        this.orderDate = orderDate;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public Order setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getDispatchDate() {
        return dispatchDate;
    }

    public Order setDispatchDate(String dispatchDate) {
        this.dispatchDate = dispatchDate;
        return this;
    }

    public String getExpectedDeliveryDate() {
        return expectedDeliveryDate;
    }

    public Order setExpectedDeliveryDate(String expectedDeliveryDate) {
        this.expectedDeliveryDate = expectedDeliveryDate;
        return this;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public Order setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
        return this;
    }

    public BigDecimal getOrderAmount() {
        return orderAmount;
    }

    public Order setOrderAmount(BigDecimal orderAmount) {
        this.orderAmount = orderAmount;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(orderId, order.orderId) && Objects.equals(orderDate, order.orderDate) && Objects.equals(status, order.status) && Objects.equals(dispatchDate, order.dispatchDate) && Objects.equals(expectedDeliveryDate, order.expectedDeliveryDate) && Objects.equals(deliveryAddress, order.deliveryAddress) && Objects.equals(orderAmount, order.orderAmount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, orderDate, status, dispatchDate, expectedDeliveryDate, deliveryAddress, orderAmount);
    }

    @Override
    public int compareTo(Order other) {
        return this.orderDate.compareTo(other.orderDate);
    }



    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", orderDate='" + orderDate + '\'' +
                ", status='" + status + '\'' +
                ", dispatchDate='" + dispatchDate + '\'' +
                ", expectedDeliveryDate='" + expectedDeliveryDate + '\'' +
                ", deliveryAddress='" + deliveryAddress + '\'' +
                ", orderAmount=" + orderAmount +
                '}';
    }
}
