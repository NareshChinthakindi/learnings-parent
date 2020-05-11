package com.rohinisha.creational.adapter;

import com.rohinisha.model.Volt;

public interface SocketAdapter {

    public Volt get120Volt();

    public Volt get12Volt();

    public Volt get3Volt();
}
