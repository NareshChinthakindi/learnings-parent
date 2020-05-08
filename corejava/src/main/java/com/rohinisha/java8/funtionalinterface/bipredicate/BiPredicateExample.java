package com.rohinisha.java8.funtionalinterface.bipredicate;

import java.util.function.BiPredicate;

public class BiPredicateExample {

    public static void main(String[] args) {
        BiPredicate<String, Integer> filter = (x, y) -> x.length() == y;

        boolean result = filter.test("naresh", 6);
        System.out.println(result);  // true

        boolean result2 = filter.test("java", 10);
        System.out.println(result2); // false
    }
}
