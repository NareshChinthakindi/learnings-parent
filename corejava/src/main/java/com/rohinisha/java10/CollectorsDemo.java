package com.rohinisha.java10;

import java.util.List;
import java.util.stream.Collectors;

public class CollectorsDemo {

    public static void main(String[] args) {

        List<Integer> list = List.of(10,23,1,3,3,3,23,3);

                                   //Unmodifietable list
        List<Integer> newList = list.stream().filter(i -> i%3 == 0).collect(Collectors.toUnmodifiableList());

        System.out.println(newList);
    }
}
