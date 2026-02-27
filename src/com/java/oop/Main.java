package com.java.oop;

public class Main {
    static void main(String[] args) {
        Customer customer1 = new Customer(101,"vishweshwar","vlshu@gmail.com","vlshu@1",(byte)20,7384659834L,'M',"Hyderabad",true);
//        customer1.id = 101;
//        customer1.name = "Vishweshwar";
//        customer1.age = 20;
//        customer1.gender = 'M';
//        customer1.email = "vishweshwar@gmail.com";
//        customer1.mobileNo = 8478758934L;
//        customer1.password = "vishweshwar@0987";
//        customer1.address = "Hyderabad";
//        customer1.isActive = true;

        System.out.println("Customer ID: " + customer1.id);
        System.out.println("Customer Name: " + customer1.name);
        System.out.println("Customer Age: " + customer1.age);
        System.out.println("Customer Gender: " + customer1.gender);
        System.out.println("Customer Email: " + customer1.email);
        System.out.println("Customer Mobile No: " + customer1.mobileNo);
        System.out.println("Is Customer Active: " + customer1.isActive);

        System.out.println();

        Customer customer2 = new Customer(102,"rajesh","rajesh@gmail.com","rajesh@11223",(byte)24,7846578437L,'M',"Hyderabad",true);
//        customer2.id = 102;
//        customer2.name = "Rajesh";
//        customer2.age = 24;
//        customer2.gender = 'M';
//        customer2.email = "Rajesh@gmail.com";
//        customer2.mobileNo = 8474659834L;
//        customer2.password = "Rajesh@8769";
//        customer2.address = "IDPL,jeedimetla";
//        customer2.isActive = false;

        System.out.println("Customer ID: " + customer2.id);
        System.out.println("Customer Name: " + customer2.name);
        System.out.println("Customer Age: " + customer2.age);
        System.out.println("Customer Gender: " + customer2.gender);
        System.out.println("Customer Email: " + customer2.email);
        System.out.println("Customer Mobile No: " + customer2.mobileNo);
        System.out.println("Is Customer Active: " + customer2.isActive);
    }
}
