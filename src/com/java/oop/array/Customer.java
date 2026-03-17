package com.java.oop.array;

public class Customer {
    //Customer Properties
    int id;
    String name;
    String email;
    boolean isActive;

    Customer(int id, String name, String email, boolean isActive) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.isActive = isActive;
    }

    public void displayCustomerDetails() {
        System.out.println("--------------------------------------------------------------------------- ");
        System.out.printf("%-5s %-20s %-30s %-20s\n", id, name, email, isActive);
    }
}
