package com.java.oop;

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

    public Product() {
        category = "Beauty";
        subCategory = "Hair Care";
        name = "Bare Anatomy Anti-Dandruff Shampoo";
        price = BigDecimal.valueOf(459);
        rating = 4.1f;
        brand = "Bare Anatomy";
        itemForm = "Liquid";
        itemWeight = null;
        itemVolume = "250 milliliters";
        itemDimensions = null;
        description = "GIVES OIL AND FRIZZ FREE HAIR, SALICYLIC ACID 0.2%w/w, BIOTIN, CLEAN & SUSTAINABLE BEAUTY";
    }


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
