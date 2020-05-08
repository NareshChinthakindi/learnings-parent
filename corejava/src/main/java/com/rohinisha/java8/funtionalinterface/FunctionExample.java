package com.rohinisha.java8.funtionalinterface;

import java.util.function.Function;

public class FunctionExample {

    public static void main(String[] args) {
        Function<String, Integer> func = String::length;
        Integer apply = func.apply("Naresh");
        System.out.println(apply);
    }
}
