package com.rohinisha.java8.defaultmethods;

public class MyClass implements Interface1, Interface2 {

	@Override
	public void method2() {
		// TODO Auto-generated method stub

	}

	@Override
	public void method1(String str) {
		// TODO Auto-generated method stub

	}

	@Override
	public void log(String str) {
		// TODO Auto-generated method stub
		Interface1.super.log(str);
	}

}
