package com.java.oop.collections.set;

import com.java.oop.model.Order;

import java.math.BigDecimal;
import java.util.Iterator;
import java.util.TreeSet;

public class OrderSet {
    public static void main(String[] args) {
        //TreeSet
        TreeSet<Order> orders = new TreeSet<Order>();

        Order order1 = new Order();
        order1.setOrderId("OD1001")
                .setOrderDate("2026-03-20")
                .setStatus("Shipped")
                .setDispatchDate("2026-03-21")
                .setExpectedDeliveryDate("2026-03-24")
                .setDeliveryAddress("Hyderabad, Telangana")
                .setOrderAmount(BigDecimal.valueOf(459.00));

        Order order2 = new Order();
        order2.setOrderId("OD1002")
                .setOrderDate("2026-03-18")
                .setStatus("Processing")
                .setDispatchDate("2026-03-22")
                .setExpectedDeliveryDate("2026-03-26")
                .setDeliveryAddress("Bengaluru, Karnataka")
                .setOrderAmount(BigDecimal.valueOf(139999.00));

        orders.add(order1);
        orders.add(order2);


        //Iterator
        Iterator<Order> iterator = orders.iterator();
        Order order = null;
        OrderService orderService = new OrderService();
        while (iterator.hasNext()) {
            order = iterator.next();
            orderService.displayOrderDetails(order);
        }
    }
}
