package com.rohinisha.java8.fork;

@FunctionalInterface
public interface GenericFunctionalInterface<X> {

    X process(X arg1, X arg2);
}
