package com.java.oop.strings;

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
        System.out.printf("%-5d %-20s %-30s %-20b\n", id, name, email, isActive);
    }
}
