package com.lavertis.functional_interfaces;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    static Function<Integer, Integer> incrementByOneFunction = number -> ++number;
    static Function<Integer, Integer> multiplyBy10Function = number -> number * 10;
    static Function<Integer, Integer> incrementAndThenMultiplyBy10Function = incrementByOneFunction.andThen(multiplyBy10Function);
    static BiFunction<Integer, Integer, Integer> incrementAndMultiplyFunction = (num, mul) -> ++num * mul;

    public static void main(String[] args) {
        int number = 4;

        int increment = incrementByOneFunction.apply(number);
        System.out.println(increment);

        int incrementAndMultiplyBy10 = incrementAndThenMultiplyBy10Function.apply(number);
        System.out.println(incrementAndMultiplyBy10);

        int incrementAndMultiplyByArgument = incrementAndMultiplyFunction.apply(number, 100);
        System.out.println(incrementAndMultiplyByArgument);
    }
}
