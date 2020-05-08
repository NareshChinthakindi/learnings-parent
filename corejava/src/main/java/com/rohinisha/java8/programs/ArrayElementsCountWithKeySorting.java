/**
 * 
 */
package com.rohinisha.java8.programs;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author Naresh_Chinthakindi
 *
 */
public class ArrayElementsCountWithKeySorting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

List<String> elements = Arrays.asList("Naresh", "Suresh", "Ramesh", "Gopal", "ANaresh", "BNaresh", "Gopal");

 Map<String, Long> elementsWithCount = elements.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
 
  Map<String, String> sortingElements = new LinkedHashMap<>();
  
 /*elementsWithCount.keySet().stream().sorted().map(String::toString).forEach(e ->{
	 sortingElements.put(e, elementsWithCount.get(e));
 });*/
 
  sortingElements = elementsWithCount.keySet().stream().sorted().map(String::toString)
 .collect(Collectors.toMap(p -> p, p ->p, (x, y) -> x+", "+ y, LinkedHashMap::new));
  
  System.out.println(sortingElements);

	}

}
