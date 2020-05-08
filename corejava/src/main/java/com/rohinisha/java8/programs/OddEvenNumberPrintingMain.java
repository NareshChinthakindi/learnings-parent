/**
 * 
 */
package com.rohinisha.java8.programs;

/**
 * @author Naresh_Chinthakindi
 *
 */
public class OddEvenNumberPrintingMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Runnable t1 = new OddEvenNumberPrinting(1);
		Runnable t2 = new OddEvenNumberPrinting(0);
		
		Thread odd = new Thread(t1, "odd");
		
		Thread even = new Thread(t2, "even");
		
		odd.start();
		even.start();
	}

}
