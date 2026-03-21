package com.java.oop.collections.set;

import com.java.oop.model.Product;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Iterator;

public class ProductSet {
    static void main(String[] args) {
        //HashSet
        HashSet<Product> products =new HashSet<>();

        Product product1 = new Product();
        product1.setCategory("Electronics")
                .setSubCategory("Smartphones")
                .setName("Galaxy S24")
                .setPrice(new BigDecimal("799.99"))
                .setRating(4.5f)
                .setBrand("Samsung")
                .setItemForm("Bar")
                .setItemWeight("168g")
                .setItemVolume("N/A")
                .setItemDimensions("146.3 x 70.9 x 7.6 mm")
                .setDescription("A high-performance smartphone with AMOLED display, powerful processor, and long-lasting battery.");

        Product product2 = new Product();
        product2.setCategory("Grocery")
                .setSubCategory("Beverages")
                .setName("Organic Green Tea")
                .setPrice(new BigDecimal("12.50"))
                .setRating(4.2f)
                .setBrand("Twinings")
                .setItemForm("Tea Bags")
                .setItemWeight("100g")
                .setItemVolume("N/A")
                .setItemDimensions("10 x 5 x 15 cm")
                .setDescription("Refreshing organic green tea rich in antioxidants.");

        Product product3 = new Product();
        product3.setCategory("Personal Care")
                .setSubCategory("Skin Care")
                .setName("Aloe Vera Gel")
                .setPrice(new BigDecimal("8.99"))
                .setRating(4.4f)
                .setBrand("Himalaya")
                .setItemForm("Gel")
                .setItemWeight("150g")
                .setItemVolume("150ml")
                .setItemDimensions("5 x 5 x 12 cm")
                .setDescription("Natural aloe vera gel for soothing and moisturizing skin.");

        Product product4 = new Product();
        product4.setCategory("Home & Kitchen")
                .setSubCategory("Cookware")
                .setName("Non-Stick Frying Pan")
                .setPrice(new BigDecimal("25.75"))
                .setRating(4.3f)
                .setBrand("Prestige")
                .setItemForm("Solid")
                .setItemWeight("800g")
                .setItemVolume("N/A")
                .setItemDimensions("30 x 30 x 5 cm")
                .setDescription("Durable non-stick frying pan ideal for everyday cooking.");

        Product product5 = new Product();
        product5.setCategory("Electronics")
                .setSubCategory("Smartphones")
                .setName("Galaxy S24")
                .setPrice(new BigDecimal("799.99"))
                .setRating(4.5f)
                .setBrand("Samsung")
                .setItemForm("Bar")
                .setItemWeight("168g")
                .setItemVolume("N/A")
                .setItemDimensions("146.3 x 70.9 x 7.6 mm")
                .setDescription("A high-performance smartphone with AMOLED display, powerful processor, and long-lasting battery.");


        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        products.add(product5);

        Product product = null;
        ProductService productService = new ProductService();

        //Iterator
        Iterator<Product> iterator = products.iterator();
        while (iterator.hasNext()) {
            product = iterator.next();
            productService.displayProductDetails(product);
        }

    }
}
