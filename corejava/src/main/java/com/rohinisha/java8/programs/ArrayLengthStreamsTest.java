/**
 * 
 */
package com.rohinisha.java8.programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Naresh_Chinthakindi
 *
 */
public class ArrayLengthStreamsTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<String> elements = Arrays.asList("Naresh", "Suresh", "Ramesh", "Gopal");
		
		/*
		 * List<Integer> lenghts =
		 * elements.stream().map(String::length).collect(Collectors.toList());
		 * 
		 * System.out.println(lenghts);
		 */
		
		
		List<Integer> lenghts = elements.stream().map(String::length).collect(Collectors.toList());
	}

}
