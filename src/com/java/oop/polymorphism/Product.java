package com.java.oop.polymorphism;

public class Product {
    String id;
    String name;
    double maxRetailPrice;
    float discountPercentage;
    float rating;
    int reviewCount;
    boolean isStockAvailable;

    public Product() {
        System.out.println("A No-Arg constructor called");
    }

    public Product(String id, String name, double maxRetailPrice, float discountPercentage, float rating, int reviewCount, boolean isStockAvailable) {
        this.id = id;
        this.name = name;
        this.maxRetailPrice = maxRetailPrice;
        this.discountPercentage = discountPercentage;
        this.rating = rating;
        this.reviewCount = reviewCount;
        this.isStockAvailable = isStockAvailable;
    }

    public void displayDetails() {
        System.out.println();
        System.out.println("Product ID: " + id);
        System.out.println("Product Name: " + name);
        System.out.println("Maximum Retail Price: ₹" + maxRetailPrice);
        System.out.println("Discount Percentage: " + discountPercentage);
        System.out.println("Rating: " + rating);
        System.out.println("Review Count: " + reviewCount);
        System.out.println("Stock Available: " + isStockAvailable);

    }
}
