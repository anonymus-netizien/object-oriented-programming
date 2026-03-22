package com.java.oop.statics;

public class Main {
    static void main(String[] args) {
        //Customer
        Customer customer1 = new Customer("C001", "Rahul", "Sharma", "rahul.sharma@example.com", 9876543210L, 'M');
        System.out.println("----------------------------------------------------------------------------------------- ");
        System.out.printf("%-10s %-15s %-15s %-25s %-13s %-6s%n", "CustID", "First Name", "Last Name", "Email", "Phone", "Gender");
        customer1.displayCustomerDetails();
        System.out.println();
        System.out.println();

        //Product
        Product product1 = new Product("P001", "Wireless Mouse", 999.0, 15.5f);
        Product product2 = new Product("P002", "Bluetooth Headphones", 2499.0, 20.0f);
        Product product3 = new Product("P003", "USB-C Charger", 1299.0, 10.0f);
        Product product4 = new Product("P004", "Laptop Stand", 1799.0, 25.0f);
        Product product5 = new Product("P005", "Mechanical Keyboard", 3499.0, 18.75f);
        System.out.println("Product ID: " + product1.id);
        System.out.println("Product Name: " + product1.name);
        System.out.println("Max Retail Price: $" + product1.maxRetailPrice);
        System.out.println("Discount Percentage: " + product1.discountPercentage + "%");
        System.out.println("Company Name: " + Product.COMPANY_NAME);

        // Accessing static constant via null reference; resolved at class level (Product.COMPANY_NAME), so no NullPointerException
        Product product = null;
        System.out.println("Company Name " + product.COMPANY_NAME);
        System.out.println("Company Name: " + Product.COMPANY_NAME);

        System.out.println();
        System.out.println();

        System.out.println("----------------------------------------------------------------------------------------- ");
        System.out.printf("%-10s %-25s %-10s %-20s %-13s %n", "ProductID", "Product Name", "MRP", "Discount Percentage", "Company Name" );
        product1.displayProductDetails();
        product2.displayProductDetails();
        product3.displayProductDetails();
        product4.displayProductDetails();
        product5.displayProductDetails();
        System.out.println();




    }
}
