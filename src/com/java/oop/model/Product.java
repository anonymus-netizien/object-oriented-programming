package com.java.oop.model;

import java.math.BigDecimal;

public class Product {
    private String category;
    private String subCategory;
    private String name;
    private BigDecimal price;
    private float rating;
    private String brand;
    private String itemForm;
    private String itemWeight;
    private String itemVolume;
    private String itemDimensions;
    private String description;

    // No-Argument Constructor
    public Product() {
    }

    public String getCategory() {
        return category;
    }

    public Product setCategory(String category) {
        this.category = category;
        return this;
    }

    public String getSubCategory() {
        return subCategory;
    }

    public Product setSubCategory(String subCategory) {
        this.subCategory = subCategory;
        return this;
    }

    public String getName() {
        return name;
    }

    public Product setName(String name) {
        this.name = name;
        return this;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public Product setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }

    public float getRating() {
        return rating;
    }

    public Product setRating(float rating) {
        this.rating = rating;
        return this;
    }

    public String getBrand() {
        return brand;
    }

    public Product setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public String getItemForm() {
        return itemForm;
    }

    public Product setItemForm(String itemForm) {
        this.itemForm = itemForm;
        return this;
    }

    public String getItemWeight() {
        return itemWeight;
    }

    public Product setItemWeight(String itemWeight) {
        this.itemWeight = itemWeight;
        return this;
    }

    public String getItemVolume() {
        return itemVolume;
    }

    public Product setItemVolume(String itemVolume) {
        this.itemVolume = itemVolume;
        return this;
    }

    public String getItemDimensions() {
        return itemDimensions;
    }

    public Product setItemDimensions(String itemDimensions) {
        this.itemDimensions = itemDimensions;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Product setDescription(String description) {
        this.description = description;
        return this;
    }

    @Override
    public String toString() {
        return "Product{" +
                "category='" + category + '\'' +
                ", subCategory='" + subCategory + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", rating=" + rating +
                ", brand='" + brand + '\'' +
                ", itemForm='" + itemForm + '\'' +
                ", itemWeight='" + itemWeight + '\'' +
                ", itemVolume='" + itemVolume + '\'' +
                ", itemDimensions='" + itemDimensions + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
