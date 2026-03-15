package com.java.oop.inheritancepolymorphism;

public class PremiumCustomer extends Customer {
    String fastDelivery;
    boolean hasEarlyAccessToSale;

    public PremiumCustomer(String id, String name, char gender, String email, long phoneNo, String address, String fastDelivery, boolean hasEarlyAccessToSale) {
        super(id, name, gender, email, phoneNo, address);
        this.fastDelivery = fastDelivery;
        this.hasEarlyAccessToSale = hasEarlyAccessToSale;
    }

    public void displayPremiumCustomerDetails() {
        super.displayCustomerDetails();
        System.out.println("Fast delivery: " + fastDelivery);
        System.out.println("hasEarlyAccessToSale: " + hasEarlyAccessToSale);
        System.out.println();
    }
}
