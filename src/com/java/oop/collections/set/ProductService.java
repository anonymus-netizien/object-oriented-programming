package com.java.oop.collections.set;

import com.java.oop.model.Product;

public class ProductService {
    void displayProductDetails(Product product) {
        System.out.println("Product Details:");
        System.out.println("Category: " + product.getCategory());
        System.out.println("SubCategory: " + product.getSubCategory());
        System.out.println("Name: " + product.getName());
        System.out.println("Price: " + product.getPrice());
        System.out.println("Rating: " + product.getRating());
        System.out.println("Brand: " + product.getBrand());
        System.out.println("Item Form: " + product.getItemForm());
        System.out.println("Item Weight: " + product.getItemWeight());
        System.out.println("Item Volume: " + product.getItemVolume());
        System.out.println("Item Dimensions: " + product.getItemDimensions());
        System.out.println("Description: " + product.getDescription());
        System.out.println();
    }
}
