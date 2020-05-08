package com.rohinisha.java11;

import java.util.Optional;

public class OptionalUpdates {

    public static void main(String[] args) {
        Optional<String> str = Optional.of("Hi");

        System.out.println(str.isPresent());

        System.out.println(str.isEmpty());
    }
}
