package com.java.oop.strings;

import java.math.BigDecimal;

public class StringAssignment {

    public static Customer[] getCustomersFromString(String[] customerData) {
        Customer[] customers = new Customer[customerData.length];
        for (int index = 0; index < customerData.length; index++) {
            String[] splitCustomerData = customerData[index].split(",");
            Customer customer = new Customer(Integer.parseInt(splitCustomerData[0].trim()), splitCustomerData[1], splitCustomerData[2], Boolean.parseBoolean(splitCustomerData[3].trim()));
            customers[index] = customer;
        }
        return customers;
    }

    public static Product[] getProductsFromString(String[] productData) {
        Product[] products = new Product[productData.length];
        for (int index = 0; index < productData.length; index++) {
            String[] splitProductData = productData[index].split(",");
            Product product = new Product(Integer.parseInt(splitProductData[0].trim()), splitProductData[1], new BigDecimal(splitProductData[2].trim()), Float.parseFloat(splitProductData[3].trim()));
            products[index] = product;
        }
        return products;
    }

    public static Payment[] getPaymentsFromString(String[] paymentData) {
        Payment[] payments = new Payment[paymentData.length];
        for (int index = 0; index < paymentData.length; index++) {
            String[] splitPaymentData = paymentData[index].split(",");
            Payment payment = new Payment(new BigDecimal(splitPaymentData[0].trim()), splitPaymentData[1], splitPaymentData[2], splitPaymentData[3], splitPaymentData[4]);
            payments[index] = payment;
        }
        return payments;
    }

    static void main(String[] args) {
        String[] customerData = {
                "1,Amit Sharma,amit.sharma@example.com,true",
                "2,Priya Reddy,priya.reddy@example.com,true",
                "3,Rahul Verma,rahul.verma@example.com,false",
                "4,Sneha Patel,sneha.patel@example.com,true",
                "5,Karan Mehta,karan.mehta@example.com,false",
                "6,Anjali Nair,anjali.nair@example.com,true",
                "7,Vikram Singh,vikram.singh@example.com,true",
                "8,Neha Gupta,neha.gupta@example.com,false",
                "9,Arjun Das,arjun.das@example.com,true",
                "10,Pooja Kulkarni,pooja.kulkarni@example.com,true",
        };

        String[] productData = {
                "1,Wireless Mouse,799.00,10.0",
                "2,Bluetooth Headphones,2499.00,15.5",
                "3,Mechanical Keyboard,4599.00,12.0",
                "4,USB-C Charger,1299.00,8.5",
                "5,Portable SSD 1TB,8999.00,20.0",
                "6,Smartwatch,6999.00,18.0",
                "7,Laptop Stand,1499.00,5.0",
                "8,Gaming Mouse Pad,599.00,7.5",
                "9,Webcam Full HD,3199.00,14.0",
                "10,Noise Cancelling Earbuds,5499.00,22.0"
        };

        String[] paymentData = {
                "459,SUCCESSFUL,01/03/2026,UPI,pay_h9584yt804985",
                "1299,FAILED,02/03/2026,CREDIT_CARD,pay_k3847gh920384",
                "799,SUCCESSFUL,03/03/2026,DEBIT_CARD,pay_m8475jk203948",
                "2499,SUCCESSFUL,04/03/2026,NET_BANKING,pay_t5938sd920485",
                "599,PENDING,05/03/2026,UPI,pay_q3948lm920384",
                "8999,SUCCESSFUL,06/03/2026,CREDIT_CARD,pay_w9483bc920384",
                "1499,FAILED,07/03/2026,UPI,pay_x3948gh203948",
                "3199,SUCCESSFUL,08/03/2026,DEBIT_CARD,pay_r4839jk203948",
                "6999,PENDING,09/03/2026,NET_BANKING,pay_p3948yt203948",
                "5499,SUCCESSFUL,10/03/2026,UPI,pay_z9483nm203948"
        };

        Customer[] customers = getCustomersFromString(customerData);
        System.out.println("--------------------------------------------------------------------------- ");
        System.out.printf("%-5s %-20s %-30s %-20s\n", "ID", "Customer Name", "Email", "isCustomerActive");
        for (Customer customer : customers) {
            customer.displayCustomerDetails();
        }
        System.out.println();
        System.out.println();
        System.out.println();

        Product[] products = getProductsFromString(productData);
        System.out.println("----------------------------------------------------------------------------------- ");
        System.out.printf("%-12s %-30s %-20s %-20s\n", "ProductId", "Name", "MaxRetailPrice", "DiscountPercentage");
        for (Product product : products) {
            product.displayProductDetails();
        }
        System.out.println();
        System.out.println();
        System.out.println();

        Payment[] payments = getPaymentsFromString(paymentData);
        System.out.println("----------------------------------------------------------------------------------------- ");
        System.out.printf("%-15s %-15s %-20s %-22s %-20s\n", "PaymentAmount", "PaymentDate", "PaymentMethod", "Transaction-Id", "PaymentStatus");
        for (Payment payment : payments) {
            payment.displayPaymentDetails();
        }
        System.out.println();
        System.out.println();
        System.out.println();
    }
}
