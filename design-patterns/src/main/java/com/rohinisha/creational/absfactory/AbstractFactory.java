package com.rohinisha.creational.absfactory;

import com.rohinisha.creational.factory.Shape;

public abstract class AbstractFactory {

    abstract Shape getShape(String shapeType);
}
