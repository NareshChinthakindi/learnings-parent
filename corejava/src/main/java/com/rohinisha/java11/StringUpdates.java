package com.rohinisha.java11;

import java.util.stream.Collectors;

public class StringUpdates {

    public static void main(String[] args) {

        String str = "";

        System.out.println(str.isBlank());

        str = "           ";

        System.out.println(str.isBlank());

        str = "Every\n program \nthat \n is \n created \n must \n have \n a \npurpose";

        System.out.println(str.lines().collect(Collectors.toList()));//split with \n and lines and collect list.


    }
}
