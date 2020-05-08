package com.rohinisha.java8.funtionalinterface;

import java.util.function.Function;

public class ChainFunctionExample {

    public static void main(String[] args) {
        Function<String, Integer> func = String::length;

        Function<Integer, Integer> func2 = x -> x * 2;

        Integer result = func.andThen(func2).apply("Naresh");  //12

        System.out.println(result);
    }
}
