package com.rohinisha.java8.programs;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ArrayElementsCountsTest {
	
	public static void main(String[] args) {
//		List<String> elements = Arrays.asList("Naresh", "Suresh", "Ramesh", "Gopal", "Naresh", "Naresh", "Gopal");
//	
//		Map<String, Long> elementsWithCount = elements.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//		
//		elementsWithCount.forEach((k, v) ->System.out.println(k+" count "+v));
		
		List<String> elements = Arrays.asList("Naresh", "Suresh", "Naresh");
		
		Map<String, Long> elementsWithCount = elements.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		elementsWithCount.forEach((k, v) ->System.out.println(k+ "count "+v));
	
	}

}
