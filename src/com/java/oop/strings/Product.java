package com.java.oop.strings;

import java.math.BigDecimal;

public class Product {
    //State variables

    int id;
    String name;
    BigDecimal maxRetailPrice;
    float discountPercentage;

    public Product(int id, String name, BigDecimal maxRetailPrice, float discountPercentage) {
        this.id = id;
        this.name = name;
        this.maxRetailPrice = maxRetailPrice;
        this.discountPercentage = discountPercentage;
    }
}
