package com.rohinisha.java9;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class ImmutableCollections {

    public static void main(String[] args) {

        List<String> listOfString = List.of("Naresh", "Suresh", "Ramesh");


//        listOfString.add("Raghu");
        System.out.println(listOfString);

        Set<String> setOfString = Set.of("Raghu", "Rame", "Ram");//Duplicate Ram will thrown and error.

        System.out.println(setOfString);

        Map<String, String> namesMap = Map.ofEntries(
                Map.entry("1", "Lokesh"),
                Map.entry("2", "Amit"),
                Map.entry("3", "Brian"));

        System.out.println(namesMap);
    }
}
