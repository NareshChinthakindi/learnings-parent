package com.rohinisha.java9;

import java.util.List;
import java.util.stream.Collectors;

public class TakeWhileDropWhile {

    public static void main(String[] args) {

    List<String> alphabets = List.of("a", "b", "c", "d", "e", "f", "g", "h", "i");

    List<String> subset1 = alphabets
            .stream()
            .takeWhile(s -> !s.equals("d"))
            .collect(Collectors.toList());

System.out.println(subset1);


        List<String> subset2 = alphabets
                .stream()
                .dropWhile(s -> !s.equals("d"))
                .collect(Collectors.toList());

        System.out.println(subset2);
    }

}
