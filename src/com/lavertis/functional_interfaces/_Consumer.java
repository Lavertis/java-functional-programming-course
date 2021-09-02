package com.lavertis.functional_interfaces;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    static Consumer<Customer> greetCustomerConsumer = customer ->
            System.out.println("Hello " + customer.name +
                    ", thanks for registering phone number " +
                    customer.phoneNumber);
    static BiConsumer<Customer, Boolean> greetCustomerConsumerV2 = (customer, showPhoneNumber) ->
            System.out.println("Hello " + customer.name +
                    ", thanks for registering phone number " +
                    (showPhoneNumber ? customer.phoneNumber : "*****"));

    public static void main(String[] args) {
        Customer customer = new Customer("Maria", "99999");
        greetCustomerConsumer.accept(customer);
        greetCustomerConsumerV2.accept(customer, false);
    }

    static class Customer {
        private final String name;
        private final String phoneNumber;

        Customer(String name, String phoneNumber) {
            this.name = name;
            this.phoneNumber = phoneNumber;
        }
    }
}
