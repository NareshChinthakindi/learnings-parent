package com.rohinisha.java8.funtionalinterface;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.BiFunction;

public class BiFunctionExample {

    public static void main(String[] args) {
        // takes two Integers and return an Integer
        BiFunction<Integer, Integer, Integer> summationOfTwoNumbers = Integer::sum;

        Integer result = summationOfTwoNumbers.apply(2, 3);

        System.out.println(result); // 5

        // take two Integers and return an Double
        BiFunction<Integer, Integer, Double> powerOfN = Math::pow;

        Double result2 = powerOfN.apply(2, 4);

        System.out.println(result2);    // 16.0

        // take two Integers and return a List<Integer>
        BiFunction<Integer, Integer, List<Integer>> sumAndReturnList = (x1, x2) -> Collections.singletonList(x1 + x2);

        List<Integer> result3 = sumAndReturnList.apply(2, 3);

        System.out.println(result3);
    }
}
