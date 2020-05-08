package com.rohinisha.java8.fork;

public class GenericFunctionalInterfaceMain {

    public static void main(String[] args) {

        GenericFunctionalInterface<String> ob1 = new GenericFunctionalInterface<String>() {
            @Override
            public String process(String arg1, String arg2) {
                return arg1 +" "+arg2;
            }
        };

        System.out.println(ob1.process("Hello", "World"));

    }
}
