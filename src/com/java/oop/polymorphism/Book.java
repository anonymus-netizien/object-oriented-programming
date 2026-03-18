package com.java.oop.polymorphism;

public class Book extends Product {
    String author;
    String publisher;

    public Book(String id, String name, double maxRetailPrice, float discountPercentage, float rating, int reviewCount, boolean isStockAvailable, String author, String publisher) {
        super(id, name, maxRetailPrice, discountPercentage, rating, reviewCount, isStockAvailable);
        this.author = author;
        this.publisher = publisher;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Author: " + author);
        System.out.println("Publisher: " + publisher);
        System.out.println();
    }
}
