package com.rohinisha.java9;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamIterate {

    public static void main(String[] args) {
        List<Integer> numbers = Stream.iterate(1, i -> i <= 10 , i -> i+1)
                .collect(Collectors.toList());

        System.out.println(numbers);
    }
}
