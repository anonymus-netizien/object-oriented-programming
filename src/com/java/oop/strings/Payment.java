package com.java.oop.strings;

import java.math.BigDecimal;

public class Payment {
    BigDecimal paymentAmount;
    String paymentStatus;
    String paymentDate;
    String paymentMethod;
    String transactionId;

    public Payment(BigDecimal paymentAmount, String paymentStatus, String paymentDate, String paymentMethod, String transactionId) {
        this.paymentAmount = paymentAmount;
        this.paymentStatus = paymentStatus;
        this.paymentDate = paymentDate;
        this.paymentMethod = paymentMethod;
        this.transactionId = transactionId;
    }

    public void displayPaymentDetails() {
        System.out.println("----------------------------------------------------------------------------------------- ");
        System.out.printf("%-15s %-15s %-20s %-22s %-20s\n", "₹" + paymentAmount, paymentDate, paymentMethod, transactionId, paymentStatus);
    }
}
