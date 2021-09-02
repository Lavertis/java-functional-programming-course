package com.lavertis.combinator_pattern;

import java.time.LocalDate;

import static com.lavertis.combinator_pattern.CustomerRegistrationValidator.*;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(
                "Alice",
                "alice@gmail.com",
                "+05345345435",
                LocalDate.of(2000, 1, 1)
        );

        ValidationResult result = isEmailValid()
                .and(isPhoneNumberValid())
                .and(isAnAdult())
                .apply(customer);

        System.out.println(result);

        if (result != ValidationResult.SUCCESS)
            throw new IllegalStateException(result.name());
    }
}
