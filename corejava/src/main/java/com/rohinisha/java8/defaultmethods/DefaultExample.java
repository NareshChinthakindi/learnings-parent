/**
 * 
 */
package com.rohinisha.java8.defaultmethods;


/**
 * @author Naresh_Chinthakindi
 *
 */
public interface DefaultExample {
	
	default String helloWorld() {
		return "Hello World";
	}
	
	
	static String testME() {
		return "This is testing";
	}

}
