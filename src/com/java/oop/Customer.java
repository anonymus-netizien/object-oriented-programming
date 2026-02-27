package com.java.oop;

public class Customer {
    //state
    int id;
    String name;
    String email;
    String password;
    byte age;
    long mobileNo;
    char gender;
    String address;
    boolean isActive;

//    Customer() {
//        id = 101;
//        name = "Vishweshwar";
//        age = 20;
//        gender = 'M';
//        email = "vishweshwar@gmail.com";
//        mobileNo = 8478758934L;
//        password = "vishweshwar@0987";
//        address = "Hyderabad";
//        isActive = true;
//    }

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
