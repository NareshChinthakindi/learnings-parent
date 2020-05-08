/**
 * 
 */
package com.rohinisha.java8.programs;

import java.util.Arrays;
import java.util.List;

/**
 * @author Naresh_Chinthakindi
 *
 */
public class SumOfArrayElements_8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		
		int sum = list.stream().mapToInt(Integer::intValue).sum();
		
		System.out.println(sum);

	}

}
