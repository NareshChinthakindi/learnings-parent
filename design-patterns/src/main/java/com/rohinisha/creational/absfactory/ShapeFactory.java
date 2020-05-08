package com.rohinisha.creational.absfactory;

import com.rohinisha.creational.factory.Rectangle;
import com.rohinisha.creational.factory.Shape;
import com.rohinisha.creational.factory.Square;

public class ShapeFactory extends AbstractFactory {


    @Override
    public Shape getShape(String shapeType){
        if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }
}
