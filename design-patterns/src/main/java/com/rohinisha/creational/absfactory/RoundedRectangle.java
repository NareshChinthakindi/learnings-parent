package com.rohinisha.creational.absfactory;

import com.rohinisha.creational.factory.Shape;

public class RoundedRectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing "+this.getClass().getSimpleName());
    }
}
