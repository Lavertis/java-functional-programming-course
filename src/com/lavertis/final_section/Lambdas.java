package com.lavertis.final_section;

import java.util.function.BiFunction;

public class Lambdas {
    public static void main(String[] args) {
        BiFunction<String, Integer, String> upperCaseName = (name, age) -> {
            if (name.isBlank())
                throw new IllegalStateException("");
            System.out.println(age);
            return name.toUpperCase();
        };

        String upperCasedName = upperCaseName.apply("Alex", 20);
        System.out.println(upperCasedName);
    }
}
