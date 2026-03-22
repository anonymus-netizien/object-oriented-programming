package com.java.oop.abstraction;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new RegularCustomer("C001", "Ravi Kumar", "ravi.kumar@gmail.com", 9876543210L, "2023-05-10");
        Customer customer2 = new PremiumCustomer("C002", "Anjali Sharma", "anjali.sharma@yahoo.com", 9123456780L, "2022-11-25");
        Customer customer3 = new RegularCustomer("C003", "Suresh Reddy", "suresh.reddy@gmail.com", 9012345678L, "2024-01-15");

        CustomerService customerService = new CustomerService();

        customerService.processDelivery(customer1, 5999);
        customerService.processDelivery(customer2, 999);
        customerService.processDelivery(customer3, 799);
    }
}
