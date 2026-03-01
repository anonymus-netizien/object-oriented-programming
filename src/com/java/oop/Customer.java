package com.java.oop;

public class Customer {
    //state variables
    int id;
    String name;
    String email;
    String password;
    byte age;
    char gender;
    long mobileNo;
    String address;
    boolean isActive;

    Customer() {
        id = 101;
        name = "vishweshwar";
        email = "vishweshwar@gmail.com";
        password = "vishweshwar@0987";
        age = 20;
        gender = 'M';
        mobileNo = 8478758934L;
        address = "Hyderabad";
        isActive = true;
    }

    public Customer(int id, String name, String email, String password, byte age, long mobileNo, char gender, String address, boolean isActive) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.age = age;
        this.mobileNo = mobileNo;
        this.gender = gender;
        this.address = address;
        this.isActive = isActive;
    }
}
