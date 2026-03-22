package com.java.oop.statics;

public class Customer {
    String custID;
    String firstName;
    String lastName;
    String email;
    long phoneNo;
    char gender;

    public Customer(String custID, String firstName, String lastName, String email, long phoneNo, char gender) {
        this.custID = custID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNo = phoneNo;
        this.gender = gender;
    }

    public void displayCustomerDetails() {
        System.out.println("----------------------------------------------------------------------------------------- ");
        System.out.printf("%-10s %-15s %-15s %-25s %-13d %-6c\n", custID, firstName, lastName, email, phoneNo, gender);
    }

}
