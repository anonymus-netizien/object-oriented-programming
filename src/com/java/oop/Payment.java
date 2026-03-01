package com.java.oop;

import java.math.BigDecimal;

public class Payment {
    //State variables
    BigDecimal paymentAmount;
    String paymentStatus;
    String paymentDate;
    String paymentMethod;
    String transactionId;

    public Payment() {
        paymentAmount = BigDecimal.valueOf(138999);
        paymentStatus = "SUCCESSFUL";
        paymentDate = "01/03/2026";
        paymentMethod = "UPI";
        transactionId = "pay_h9584yt804985";
    }

    public Payment(BigDecimal paymentAmount, String paymentStatus, String paymentDate, String paymentMethod, String transactionId) {
        this.paymentAmount = paymentAmount;
        this.paymentStatus = paymentStatus;
        this.paymentDate = paymentDate;
        this.paymentMethod = paymentMethod;
        this.transactionId = transactionId;
    }
}
