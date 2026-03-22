package com.java.oop.statics;

public class Product {
    String id;
    String name;
    double maxRetailPrice;
    float discountPercentage;
    static final String COMPANY_NAME = "ABC Company";
    static final String COMPANY_ADDRESS = "123 Main St, City";
    static final String COMPANY_PHONE = "123-456-7890";

    public Product(String id, String name, double maxRetailPrice, float discountPercentage) {
        this.id = id;
        this.name = name;
        this.maxRetailPrice = maxRetailPrice;
        this.discountPercentage = discountPercentage;
    }

    public void displayProductDetails(){
        System.out.println("----------------------------------------------------------------------------------------- ");
        System.out.printf("%-10s %-25s %-10s %-20s %-13s %n", id, name, maxRetailPrice, discountPercentage, COMPANY_NAME);

    }

}
