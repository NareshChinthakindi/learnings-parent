package com.rohinisha.creational.singleton;

public class SingletonMain {

    public static void main(String[] args) {

        SingletonObj obj = SingletonObj.getInstance();

        System.out.println(obj.getName("Test"));
    }
}
