package com.lavertis.functional_interfaces;

import java.util.List;
import java.util.function.Supplier;

public class _Supplier {
    static Supplier<List<String>> getDBConnectionUrlsSupplier = () ->
            List.of("jdbc://localhost:5432/users", "jdbc://localhost:5432/customers");

    public static void main(String[] args) {
        System.out.println(getDBConnectionUrlsSupplier.get());
    }
}
