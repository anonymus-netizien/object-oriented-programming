package com.java.oop.model;

import java.math.BigDecimal;

public class Main {
    static void main(String[] args) {
        Customer customer1 = new Customer();
        customer1.setId(101)
                .setName("customer1")
                .setEmail("customer1@gmail.com")
                .setPhoneNo(9876543210L)
                .setActive(true)
                .setPassword("customer@123");

        System.out.println("Customer Details:");
        System.out.println("ID: " + customer1.getId());
        System.out.println("Name: " + customer1.getName());
        System.out.println("Email: " + customer1.getEmail());
        System.out.println("Phone No: " + customer1.getPhoneNo());
        System.out.println("Active: " + customer1.isActive());
        System.out.println();
        System.out.println("--------- Using toString ---------");
        System.out.println(customer1);

        Customer customer2 = new Customer();
        customer2.setId(102).setName("Customer2").setPassword("customer2@123");

        Product product1 = new Product();
        product1.setCategory("Beauty").
                setSubCategory("Hair Care").
                setName("Bare Anatomy Anti-Dandruff Shampoo").
                setPrice(BigDecimal.valueOf(459)).
                setRating(4.1f).
                setBrand("Bare Anatomy").
                setItemForm("liquid").
                setItemVolume("250 milliliters").
                setItemDimensions(null).
                setDescription("GIVES OIL AND FRIZZ FREE HAIR, SALICYLIC ACID 0.2%w/w, BIOTIN, CLEAN & SUSTAINABLE BEAUTY");
        System.out.println(product1);

        Product product2 = new Product();
        product2.setCategory("Electronics")
                .setSubCategory("Mobile & Accessories")
                .setName("Samsung S26 Ultra 5G")
                .setPrice(BigDecimal.valueOf(139999))
                .setRating(0.0f)
                .setBrand("Samsung")
                .setItemForm("solid")
                .setItemWeight("216 grams")
                .setItemVolume(null)
                .setItemDimensions("8 x 78 x 164 Millimeters")
                .setDescription("Samsung Galaxy S26 Ultra 5G is Samsung’s 2026 flagship smartphone featuring a powerful Snapdragon 8 Elite Gen 5 chip, a stunning 6.9″ Dynamic AMOLED display with built-in Privacy Display, advanced quad-camera system (including a 200MP sensor), and strong AI-enhanced performance with long battery life.");
        System.out.println(product2);

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

        System.out.println("Order 1 ID: " + order1.getOrderId() + ", Status: " + order1.getStatus() + ", Amount: " + order1.getOrderAmount());
        System.out.println("Order 2 ID: " + order2.getOrderId() + ", Status: " + order2.getStatus() + ", Amount: " + order2.getOrderAmount());

        System.out.println(order1);
        System.out.println(order2);

    }
}
