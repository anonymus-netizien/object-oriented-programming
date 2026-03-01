package com.java.oop;

import java.math.BigDecimal;

public class Order {
    String productId;
    String productName;
    byte quantity;
    BigDecimal unitPrice;
    BigDecimal discountApplied;
    String taxApplied;
    BigDecimal subTotal;

    public Order() {
        productId = "M895684";
        productName = "Samsung S26 Ultra 5G";
        quantity = 1;
        unitPrice = BigDecimal.valueOf(139999);
        discountApplied = BigDecimal.valueOf(1000);
        taxApplied = "including GST";
        subTotal = unitPrice.subtract(discountApplied);
    }

    public Order(String productId, String productName, byte quantity, BigDecimal unitPrice, BigDecimal discountApplied, String taxApplied, BigDecimal subTotal) {
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.discountApplied = discountApplied;
        this.taxApplied = taxApplied;
        this.subTotal = subTotal;
    }
}
