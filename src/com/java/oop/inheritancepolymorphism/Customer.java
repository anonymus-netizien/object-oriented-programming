package com.java.oop.inheritancepolymorphism;

public class Customer {
    String id;
    String name;
    char gender;
    String email;
    long phoneNo;
    String address;

    public Customer(String id, String name, char gender, String email, long phoneNo, String address) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.email = email;
        this.phoneNo = phoneNo;
        this.address = address;
    }

    public void displayCustomerDetails() {
        System.out.println("--------- Customer details: ---------");
        System.out.println("Customer ID: " + id);
        System.out.println("Customer Name: " + name);
        System.out.println("Customer Gender: " + gender);
        System.out.println("Customer Email: " + email);
        System.out.println("Customer Phone No: " + phoneNo);
        System.out.println("Customer Address: " + address);
    }
}
