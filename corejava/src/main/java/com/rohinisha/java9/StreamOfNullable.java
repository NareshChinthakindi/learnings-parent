package com.rohinisha.java9;

import java.util.stream.Stream;

public class StreamOfNullable {

    public static void main(String[] args) {
        Stream<String> stream = Stream.ofNullable("123");
        System.out.println(stream.count());

        stream = Stream.ofNullable(null);
        System.out.println(stream.count());
    }
}
