/**
 * 
 */
package com.rohinisha.java8.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Naresh_Chinthakindi
 *
 */
public class ArrayLengthStreams {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<String> elements = Arrays.asList("Naresh", "Suresh", "Ramesh", "Gopal");
		List<Integer> elementsLenghts = elements.stream().map(String::length).collect(Collectors.toList());
        elementsLenghts.forEach(System.out::println);
        
     //   List<Map<String, String>> values = new ArrayList<HashMap<String>>();
        
    //   elements.stream().map(String::length).collect(Collectors.toMap(e, e));
      //  elementsLenghts.forEach(System.out::println);
		
		
	}

}
