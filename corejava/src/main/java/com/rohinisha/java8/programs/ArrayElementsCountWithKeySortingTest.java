package com.rohinisha.java8.programs;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ArrayElementsCountWithKeySortingTest {
	
	public static void main(String[] args) {
		
		
		
		List<String> elements = Arrays.asList("Naresh", "Suresh", "Ramesh", "Gopal", "ANaresh", "BNaresh", "Gopal");
 
	  final Map<String,Long> elementsWithCount = elements.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
	   
	  final Map<String, Long> sortedMap = new LinkedHashMap<String, Long>();
	   
	   elementsWithCount.keySet().stream().sorted().forEach(key ->{
		   sortedMap.put(key, elementsWithCount.get(key));
	   });
	   
	   sortedMap.forEach((k, v) ->{
		   System.out.println(k+" "+v);
	   });
		
	}

}
