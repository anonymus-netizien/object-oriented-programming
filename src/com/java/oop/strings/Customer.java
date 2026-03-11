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
    }

    public void displayCustomerDetails() {
        System.out.println("--------------------------------------------------------------------------- ");
        System.out.printf("%-5d %-20s %-30s %5b\n", id, name, email, isActive);
    }
}
