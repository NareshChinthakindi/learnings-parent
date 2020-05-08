/**
 * 
 */
package com.rohinisha.java8.defaultmethods;

/**
 * @author Naresh_Chinthakindi
 *
 */
public class DefaultExampleImpl implements DefaultExample {
	
	
	/*
	 * @Override public String helloWorld() { return "Naresh"; }
	 */
	
	public static void main(String[] args) {
		
		DefaultExample obj = new DefaultExampleImpl();
		
	
		System.out.println(obj.helloWorld());
		System.out.println(DefaultExample.testME());
	}

}
