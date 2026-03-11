package com.java.oop.array;

import java.math.BigDecimal;

public class ProductArray {
    static void main(String[] args) {
        Product[] products = new Product[7];

        products[0] = new Product(
                        "Beauty",
                        "Hair Care",
                        "Bare Anatomy Anti-Dandruff Shampoo",
                        BigDecimal.valueOf(459),
                        4.1f,
                        "Bare Anatomy",
                        "Liquid",
                        null,
                        "250 milliliters",
                        null,
                        "GIVES OIL AND FRIZZ FREE HAIR, SALICYLIC ACID 0.2%w/w, BIOTIN, CLEAN & SUSTAINABLE BEAUTY");
        products[1] = new Product(
                        "Beauty",
                        "Hair Care",
                        "Mamaearth Onion Hair Fall Control Shampoo",
                        BigDecimal.valueOf(349),
                        4.3f,
                        "Mamaearth",
                        "Liquid",
                        null,
                        "250 milliliters",
                        null,
                        "REDUCES HAIR FALL, ONION OIL, PLANT KERATIN, SULFATE & PARABEN FREE");
        products[2] = new Product(
                        "Beauty",
                        "Hair Care",
                        "WOW Skin Science Onion Black Seed Oil Shampoo",
                        BigDecimal.valueOf(499),
                        4.2f,
                        "WOW Skin Science",
                        "Liquid",
                        null,
                        "300 milliliters",
                        null,
                        "STRENGTHENS HAIR ROOTS, BLACK SEED OIL, NO PARABENS OR SILICONES");
        products[3] = new Product(
                        "Beauty",
                        "Hair Care",
                        "L'Oreal Paris Total Repair 5 Shampoo",
                        BigDecimal.valueOf(379),
                        4.4f,
                        "L'Oreal Paris",
                        "Liquid",
                        null,
                        "340 milliliters",
                        null,
                        "REPAIRS DAMAGED HAIR, PRO-KERATIN, SMOOTH AND STRONG HAIR");
        products[4] = new Product(
                        "Beauty",
                        "Hair Care",
                        "Head & Shoulders Anti-Dandruff Shampoo",
                        BigDecimal.valueOf(399),
                        4.5f,
                        "Head & Shoulders",
                        "Liquid",
                        null,
                        "340 milliliters",
                        null,
                        "REMOVES DANDRUFF, ZINC PYRITHIONE FORMULA, CLEAN & FRESH SCALP");
        products[5] = new Product(
                        "Beauty",
                        "Hair Care",
                        "Tresemme Keratin Smooth Shampoo",
                        BigDecimal.valueOf(525),
                        4.3f,
                        "Tresemme",
                        "Liquid",
                        null,
                        "580 milliliters",
                        null,
                        "KERATIN & ARGAN OIL, CONTROLS FRIZZ, SALON SMOOTH HAIR");
        products[6] = new Product(
                        "Beauty",
                        "Hair Care",
                        "Dove Intense Repair Shampoo",
                        BigDecimal.valueOf(420),
                        4.4f,
                        "Dove",
                        "Liquid",
                        null,
                        "340 milliliters",
                        null,
                        "REPAIRS DAMAGE, KERATIN ACTIVES, SOFT AND STRONG HAIR");

        for (int i = 0; i < products.length; i++) {
            System.out.println("Category: " + products[i].category);
            System.out.println("SubCategory: " + products[i].subCategory);
            System.out.println("Product Name: " + products[i].name);
            System.out.println("Price: ₹" + products[i].price);
            System.out.println("Rating: " + products[i].rating);
            System.out.println("Brand: " + products[i].brand);
            System.out.println("Item Form: " + products[i].itemForm);
            System.out.println("Volume: " + products[i].itemVolume);
            System.out.println("Product Dimensions: " + products[i].itemDimensions);
            System.out.println("Product Description: " + products[i].description);
            System.out.println();
        }

        System.out.println("------- For each loop -------");
        System.out.println();
        for (Product product: products){
            System.out.println("Category: " + product.category);
            System.out.println("SubCategory: " + product.subCategory);
            System.out.println("Product Name: " + product.name);
            System.out.println("Price: ₹" + product.price);
            System.out.println("Rating: " + product.rating);
            System.out.println("Brand: " + product.brand);
            System.out.println("Item Form: " + product.itemForm);
            System.out.println("Volume: " + product.itemVolume);
            System.out.println("Product Dimensions: " + product.itemDimensions);
            System.out.println("Product Description: " + product.description);
            System.out.println();
        }

    }
}
