package com.java.oop;

import java.math.BigDecimal;

public class Main {
    static void main(String[] args) {

        //No Argument Constructor
        System.out.println("------ NoArgument Constructor ------");
        System.out.println();

        System.out.println("Customer Details:-");
        Customer customer1 = new Customer();
        System.out.println("Customer ID: " + customer1.id);
        System.out.println("Customer Name: " + customer1.name);
        System.out.println("Customer Email: " + customer1.email);
        System.out.println("Customer Password: " + customer1.password);
        System.out.println("Customer Age: " + customer1.age);
        System.out.println("Customer Gender: " + customer1.gender);
        System.out.println("Customer Mobile No: " + customer1.mobileNo);
        System.out.println("Customer Address: " + customer1.address);
        System.out.println("Is Customer Active: " + customer1.isActive);

        System.out.println();

        System.out.println("Product Details:-");
        Product product1 = new Product();
        System.out.println("Product Category: " + product1.category);
        System.out.println("Product Sub-Category: " + product1.subCategory);
        System.out.println("Product Name: " + product1.name);
        System.out.println("Product Price: ₹" + product1.price);
        System.out.println("Product Rating: " + product1.rating);
        System.out.println("Product Brand: " + product1.brand);
        System.out.println("Product Form: " + product1.itemForm);
        System.out.println("Product weight: " + product1.itemWeight);
        System.out.println("Product Volume: " + product1.itemVolume);
        System.out.println("Product Dimensions: " + product1.itemDimensions);
        System.out.println("Product Description: " + product1.description);

        System.out.println();

        System.out.println("Payment Details:-");
        Payment payment1 = new Payment();
        System.out.println("Payment Amount: ₹" + payment1.paymentAmount);
        System.out.println("Payment Status: " + payment1.paymentStatus);
        System.out.println("Payment Date: " + payment1.paymentDate);
        System.out.println("Payment Method: " + payment1.paymentMethod);
        System.out.println("Transaction ID: " + payment1.transactionId);

        System.out.println();

        System.out.println("Order Details:-");
        Order order1 = new Order();
        System.out.println("Order ID: " + order1.orderId);
        System.out.println("Order Date: " + order1.orderDate);
        System.out.println("Order Status: " + order1.status);
        System.out.println("Dispatch Date: " + order1.dispatchDate);
        System.out.println("Expected Delivery on : " + order1.expectedDeliveryDate);
        System.out.println("Delivery Address: " + order1.deliveryAddress);
        System.out.println("Order Value: " + order1.orderAmount);

        System.out.println();

        //Argument Constructor
        System.out.println("------ Argument Constructor ------");
        System.out.println();

        System.out.println("Customer Details:-");
        Customer customer2 = new Customer(102, "Rajesh", "rajesh@gmail.com", "Rajesh@11223", (byte) 24, 7846578437L, 'M', "Hyderabad", true);
        System.out.println("Customer ID: " + customer2.id);
        System.out.println("Customer Name: " + customer2.name);
        System.out.println("Customer Email: " + customer2.email);
        System.out.println("Customer Password: " + customer2.password);
        System.out.println("Customer Age: " + customer2.age);
        System.out.println("Customer Gender: " + customer2.gender);
        System.out.println("Customer Mobile No: " + customer2.mobileNo);
        System.out.println("Customer Address: " + customer2.address);
        System.out.println("Is Customer Active: " + customer2.isActive);

        System.out.println();

        System.out.println("Product Details:-");
        Product product2 = new Product("Electronics", "Mobile & Accessories", "Samsung S26 Ultra 5G", new BigDecimal("139999"), 0.0f, "Samsung", "solid", "216 grams", null, "8 x 78 x 164 Millimeters", "Samsung Galaxy S26 Ultra 5G is Samsung’s 2026 flagship smartphone featuring a powerful Snapdragon 8 Elite Gen 5 chip, a stunning 6.9″ Dynamic AMOLED display with built‑in Privacy Display, advanced quad‑camera system (including a 200MP sensor), and strong AI‑enhanced performance with long battery life.");
        System.out.println("Product Category: " + product2.category);
        System.out.println("Product Sub-Category: " + product2.subCategory);
        System.out.println("Product Name: " + product2.name);
        System.out.println("Product Price: ₹" + product2.price);
        System.out.println("Product Rating: " + product2.rating);
        System.out.println("Product Brand: " + product2.brand);
        System.out.println("Product Form: " + product2.itemForm);
        System.out.println("Product weight: " + product2.itemWeight);
        System.out.println("Product Volume: " + product2.itemVolume);
        System.out.println("Product Dimensions: " + product2.itemDimensions);
        System.out.println("Product Description: " + product2.description);

        System.out.println();

        System.out.println("Payment Details:-");
        Payment payment2 = new Payment(new BigDecimal(138999),"SUCCESSFUL","01/03/2026","Credit Card","pay_n85yt9498yt5y9h");
        System.out.println("Payment Amount: ₹" + payment2.paymentAmount);
        System.out.println("Payment Status: " + payment2.paymentStatus);
        System.out.println("Payment Date: " + payment2.paymentDate);
        System.out.println("Payment Method: " + payment2.paymentMethod);
        System.out.println("Transaction ID: " + payment2.transactionId);

        System.out.println();

        System.out.println("Order Details:-");
        Order order2 = new Order("78436-734434-4352","03/03/2026","dispatched","04/03/2026","06/03/2026","Hyderabad",new BigDecimal(138999));
        System.out.println("Product ID: " + order2.orderId);
        System.out.println("Order Date: " + order2.orderDate);
        System.out.println("Order Status: " + order2.status);
        System.out.println("Dispatch Date: " + order2.dispatchDate);
        System.out.println("Expected Delivery on : " + order2.expectedDeliveryDate);
        System.out.println("Delivery Address: " + order2.deliveryAddress);
        System.out.println("Order Value: " + order2.orderAmount);

        System.out.println();



    }
}

