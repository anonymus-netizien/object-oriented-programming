package com.java.oop.inheritancepolymorphism;

public class Main {
    public static void main(String[] args) {

        RegularCustomer rCustomer1 = new RegularCustomer(
                "Cust-00001",
                "Customer1",
                'M',
                "customer1@gmail.com",
                9874548375L,
                "Hyderabad",
                "7 Days",
                "49.99"
        );
        rCustomer1.displayRegularCustomerDetails();

        RegularCustomer rCustomer2 = new RegularCustomer(
                "Cust-00002",
                "Customer2",
                'F',
                "customer2@gmail.com",
                9876543210L,
                "Bangalore",
                "7 Days",
                "49.99"
        );
        rCustomer2.displayRegularCustomerDetails();

        PremiumCustomer pCustomer1 = new PremiumCustomer(
                "Cust-00003",
                "Customer3",
                'M',
                "customer3@gmail.com",
                9871234567L,
                "Chennai",
                "2 Days",
                true
        );
        pCustomer1.displayPremiumCustomerDetails();

        PremiumCustomer pCustomer2 = new PremiumCustomer(
                "Cust-00004",
                "Customer4",
                'F',
                "customer4@gmail.com",
                9879876543L,
                "Mumbai",
                "1 Day",
                true
        );
        pCustomer2.displayPremiumCustomerDetails();

    }
}
