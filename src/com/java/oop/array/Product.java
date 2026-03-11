package com.java.oop.array;

import java.math.BigDecimal;

public class Product {
    //state variables
    String category;
    String subCategory;
    String name;
    BigDecimal price;
    float rating;
    String brand;
    String itemForm;
    String itemWeight;
    String itemVolume;
    String itemDimensions;
    String description;

    public Product(String category, String subCategory, String name, BigDecimal price, float rating, String brand, String itemForm, String itemWeight, String itemVolume, String itemDimensions, String description) {
        this.category = category;
        this.subCategory = subCategory;
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.brand = brand;
        this.itemForm = itemForm;
        this.itemWeight = itemWeight;
        this.itemVolume = itemVolume;
        this.itemDimensions = itemDimensions;
        this.description = description;
    }
}
