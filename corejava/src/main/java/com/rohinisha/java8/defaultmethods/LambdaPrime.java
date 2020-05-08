/**
 * 
 */
package com.rohinisha.java8.defaultmethods;

import java.util.stream.IntStream;

/**
 * @author Naresh_Chinthakindi
 *
 */
public class LambdaPrime {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(isPrime(139));
	}

	public static boolean isPrime(int number) {
//	    return !IntStream.rangeClosed(2, Integer.parseInt(String.valueOf(Math.round(Math.ceil(Math.sqrt(number)))))).anyMatch(i -> number%i == 0);
	    return !IntStream.rangeClosed(2, Integer.parseInt(String.valueOf(Math.round(Math.ceil(Math.sqrt(number)))))).filter(i -> {
	    	System.out.println("i "+i);
	     	return number%i==0;
	    }).findAny().isPresent();
	    }
		
		/*
		 * return !IntStream.rangeClosed(2,
		 * Integer.parseInt(String.valueOf(Math.round(Math.ceil(Math.sqrt(number)))))).
		 * anyMatch(i -> { System.out.println("i "+i); return number%i == 0; });
		
	} */
}
