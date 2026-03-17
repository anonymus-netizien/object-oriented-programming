package com.java.oop.array;

import java.math.BigDecimal;

public class ArrayMain {
    static void main(String[] args) {
        //Customer Section
        Customer[] customers = {
                new Customer(101, "Rahul Sharma", "rahul.sharma@example.com", true),
                new Customer(102, "Priya Verma", "priya.verma@example.com", true),
                new Customer(103, "Amit Patel", "amit.patel@example.com", false),
                new Customer(104, "Sneha Gupta", "sneha.gupta@example.com", true),
                new Customer(105, "Vikram Singh", "vikram.singh@example.com", false)
        };

//        System.out.println("--------------------------------------------------------------------------- ");
        System.out.println("                      ....... CUSTOMERS DETAILS .......");
        System.out.println("--------------------------------------------------------------------------- ");
        System.out.printf("%-5s %-20s %-30s %-20s\n", "ID", "Customer Name", "Email", "isCustomerActive");
        for (Customer customer : customers) {
            customer.displayCustomerDetails();
        }
        System.out.println("--------------------------------------------------------------------------- ");
        System.out.println();
        System.out.println();


        //Order Section
        Order[] orders = {
                new Order("ORD1001", "2026-03-10", "Processing", null, null, "12 MG Road, Bengaluru, India", new BigDecimal("499.99")),
                new Order("ORD1002", "2026-03-11", "Shipped", "2026-03-12", "2026-03-16", "221B Baker Street, London", new BigDecimal("1299.50")),
                new Order("ORD1003", "2026-03-12", "Delivered", "2026-03-13", "2026-03-17", "742 Evergreen Terrace, Springfield", new BigDecimal("259.75")),
                new Order("ORD1004", "2026-03-13", "Cancelled", null, null, "1600 Amphitheatre Parkway, Mountain View, CA", new BigDecimal("0.00")),
                new Order("ORD1005", "2026-03-14", "Out for Delivery", "2026-03-15", "2026-03-18", "4 Privet Drive, Little Whinging, UK", new BigDecimal("899.00"))
        };
//        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("                                                 ****** ORDER DETAILS ******");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("%-10s %-13s %-15s %-15s %-15s %-20s %-50s \n", "Order ID", "Order Date", "Order Amount", "Order Status", "Dispatch Date", "Expected Delivery", "Delivery Address");
        for (Order order : orders) {
            order.displayOrderDetails();
        }
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println();
        System.out.println();


        //Payment Section
        Payment[] payments = {
                new Payment(new BigDecimal("499.99"), "Completed", "2026-03-10", "Credit Card", "TXN10001"),
                new Payment(new BigDecimal("1299.50"), "Completed", "2026-03-11", "UPI", "TXN10002"),
                new Payment(new BigDecimal("259.75"), "Failed", "2026-03-12", "Debit Card", "TXN10003"),
                new Payment(new BigDecimal("899.00"), "Pending", "2026-03-13", "Net Banking", "TXN10004"),
                new Payment(new BigDecimal("1599.00"), "Completed", "2026-03-14", "Wallet", "TXN10005")
        };
        System.out.println("------------------------------###################---------------------------------------- ");
        System.out.println("                                PAYMENT DETAILS                                             ");
        System.out.println("----------------------------------------------------------------------------------------- ");
        System.out.printf("%-15s %-15s %-20s %-22s %-20s\n", "PaymentAmount", "PaymentDate", "PaymentMethod", "TransactionId", "PaymentStatus");
        for (Payment payment : payments) {
            payment.displayPaymentDetails();
        }
        System.out.println("----------------------------------------------------------------------------------------- ");
        System.out.println();
    }
}
