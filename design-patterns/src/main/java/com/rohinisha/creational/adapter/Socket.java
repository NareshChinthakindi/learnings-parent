package com.rohinisha.creational.adapter;

import com.rohinisha.model.Volt;

public class Socket {

    public Volt getVolt(){
        return new Volt(120);
    }
}
