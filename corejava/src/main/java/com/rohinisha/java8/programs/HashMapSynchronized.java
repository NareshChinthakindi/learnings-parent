/**
 * 
 */
package com.rohinisha.java8.programs;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Naresh_Chinthakindi
 *
 */
public class HashMapSynchronized {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		final Map<String, String> valuesWithNames = new HashMap<>();
		
		final Map<String,String> synchronizedMap = Collections.synchronizedMap(valuesWithNames);
		
		final Map<String, String> table = new ConcurrentHashMap<>();

	}

}
