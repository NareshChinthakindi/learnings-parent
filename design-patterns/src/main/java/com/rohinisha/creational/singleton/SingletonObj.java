package com.rohinisha.creational.singleton;

import java.io.Serializable;

public class SingletonObj implements Serializable {

    private static SingletonObj obj = null;

    private SingletonObj() {

    }

    protected Object readResolve() {
        return getInstance();
    }

    public static SingletonObj getInstance() {

         if (obj == null) {

             synchronized (SingletonObj.class) {
                 if (obj == null) {
                     obj = new SingletonObj();
                 }
             }

         }

         return obj;

    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Clone Not Supported");
    }

    public String getName(String str) {
        return str + this.getClass().getSimpleName();
    }
}
