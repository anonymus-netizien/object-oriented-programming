package com.java.oop.strings;

public class StringAssignment {

    public static Customer[] getCustomersFromString(String[] customerData) {
        Customer[] customers = new Customer[customerData.length];
        for (int index = 0; index < customerData.length; index++) {
            String[] splitCustomerData = customerData[index].split(",");
            Customer customer = new Customer(Integer.parseInt(splitCustomerData[0]), splitCustomerData[1], splitCustomerData[2], Boolean.parseBoolean(splitCustomerData[3]));
            customers[index] = customer;
        }
        return customers;
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

        Customer[] customers = getCustomersFromString(customerData);
        System.out.println("--------------------------------------------------------------------------- ");
        System.out.printf("%-5s %-20s %-30s %5s\n", "ID", "Customer Name", "Email", "isCustomerActive");
        for (Customer customer : customers) {
            customer.displayCustomerDetails();
        }
    }
}
