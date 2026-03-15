package com.java.oop.inheritancepolymorphism;

public class RegularCustomer extends Customer {
    String StandardDelivery;
    String deliveryChargesApplicable;

    public RegularCustomer(String id, String name, char gender, String email, long phoneNo, String address, String standardDelivery, String deliveryChargesApplicable) {
        super(id, name, gender, email, phoneNo, address);
        StandardDelivery = standardDelivery;
        this.deliveryChargesApplicable = deliveryChargesApplicable;
    }

    public void displayRegularCustomerDetails() {
        super.displayCustomerDetails();
        System.out.println("Standard delivery: " + StandardDelivery);
        System.out.println("deliveryCharges: " + deliveryChargesApplicable);
        System.out.println();
    }
}
