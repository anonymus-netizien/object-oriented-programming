package com.java.oop.collections.set;

import com.java.oop.model.Customer;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class CustomerSet {
    static void main(String[] args) {
        //Linked HashSet
        LinkedHashSet<Customer> customers = new LinkedHashSet<>();

        Customer customer1 = new Customer();
        customer1.setId(101)
                .setName("John Doe")
                .setEmail("johndoe@gmail.com")
                .setPassword("john@123")
                .setPhoneNo(9876543210L)
                .setActive(true);

        Customer customer2 = new Customer();
        customer2.setId(102)
                .setName("Jane Smith")
                .setEmail("janesmith@gmail.com")
                .setPassword("jane@123")
                .setPhoneNo(9123456780L)
                .setActive(false);

        Customer customer3 = new Customer();
        customer3.setId(103)
                .setName("Alice Johnson")
                .setEmail("alice.johnson@gmail.com")
                .setPassword("alice@123")
                .setPhoneNo(9012345678L)
                .setActive(true);

        Customer customer4 = new Customer();
        customer4.setId(104)
                .setName("Bob Williams")
                .setEmail("bob.williams@gmail.com")
                .setPassword("bob@123")
                .setPhoneNo(9988776655L)
                .setActive(false);

        Customer customer5 = new Customer();
        customer5.setId(105)
                .setName("Charlie Brown")
                .setEmail("charlie.brown@gmail.com")
                .setPassword("charlie@123")
                .setPhoneNo(9871234560L)
                .setActive(true);

        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);
        customers.add(customer4);
        customers.add(customer5);

        //Iterator
        Customer customer = null;
        CustomerService customerService = new CustomerService();
        Iterator<Customer> iterator = customers.iterator();
        while (iterator.hasNext()) {
            customer = iterator.next();
            customerService.displayCustomerDetails(customer);
        }



    }
}
