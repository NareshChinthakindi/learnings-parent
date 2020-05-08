package com.rohinisha.java8.funtionalinterface;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class BinaryOperatorExamples {
    public static void main(String[] args) {
        // BiFunction
        BiFunction<Integer, Integer, Integer> func = Integer::sum;

        Integer result = func.apply(2, 3);

        System.out.println(result); // 5

        // BinaryOperator
        BinaryOperator<Integer> func2 = Integer::sum;

        Integer result2 = func2.apply(2, 3);

        System.out.println(result2); // 5
    }
}
