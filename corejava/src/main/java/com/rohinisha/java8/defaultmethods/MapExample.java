/**
 * 
 */
package com.rohinisha.java8.defaultmethods;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author Naresh_Chinthakindi
 *
 */
public class MapExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,43,45,6,6);
		
		
		Map<Integer, Long> mapWithList = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		Map<Integer, Long> mapWithList2 = list.stream().skip(3).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		System.out.println(mapWithList);
		System.out.println(mapWithList2);
		
		Optional<Integer> intOptional =	list.stream().reduce( (current, nextElement) ->{
			
			return current * nextElement;
		});
		
		if(intOptional.isPresent()) System.out.println("Multiplication = "+intOptional.get());

	}

}
