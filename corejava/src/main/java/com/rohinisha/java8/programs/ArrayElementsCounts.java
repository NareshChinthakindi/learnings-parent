/**
 * 
 */
package com.rohinisha.java8.programs;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author Naresh_Chinthakindi
 *
 */
public class ArrayElementsCounts {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> elements = Arrays.asList("Naresh", "Suresh", "Ramesh", "Gopal", "Naresh", "Naresh", "Gopal");

		
		Map<String, Long> elementsWithCount = elements.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		elementsWithCount.forEach((k,v)->{
			System.out.println(k+" : Count: "+v);
		});
	}

}
