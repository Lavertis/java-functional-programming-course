package com.lavertis.functional_interfaces;

import java.util.function.Predicate;

public class _Predicate {
    static Predicate<String> isPhoneNumberValidPredicate = num -> num.startsWith("07") && num.length() == 11;
    static Predicate<String> containsNumber3 = num -> num.contains("3");

    public static void main(String[] args) {
        System.out.println(isPhoneNumberValidPredicate.test("07000000000"));
        System.out.println(isPhoneNumberValidPredicate.test("0700000000"));
        System.out.println(isPhoneNumberValidPredicate.test("09009877300"));

        System.out.print("Is phone number valid and contains number 3 = ");
        System.out.println(isPhoneNumberValidPredicate.or(containsNumber3).test("07000000000"));
        System.out.print("Is phone number valid and contains number 3 = ");
        System.out.println(isPhoneNumberValidPredicate.and(containsNumber3).test("07000000003"));
    }
}
