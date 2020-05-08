/**
 * 
 */
package com.rohinisha.java8.defaultmethods;

import java.util.Arrays;
import java.util.List;

/**
 * @author Naresh_Chinthakindi
 *
 */
public class Summation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		
		int value = list.stream().filter(i-> i>4).mapToInt(i ->i).sum();
		
		System.out.println(value);
		

	}

}
