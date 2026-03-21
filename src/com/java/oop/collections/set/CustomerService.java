package com.java.oop.collections.set;

import com.java.oop.model.Customer;

public class CustomerService {
    public void displayCustomerDetails(Customer customer) {
        System.out.println("Customer Details:");
        System.out.println(
                "Id: " + customer.getId() + "\n" +
                        "Name: " + customer.getName() + "\n" +
                        "Email: " + customer.getEmail() + "\n" +
                        "Password: " + customer.getPassword() + "\n" +
                        "Phone No: " + customer.getPhoneNo() + "\n" +
                        "Active: " + customer.isActive()
        );
        System.out.println();
    }
}
