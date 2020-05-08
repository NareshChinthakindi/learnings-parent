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
public class FiltersExample {
	
	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(
                new Person("naresh", 30),
                new Person("jack", 20),
                new Person("lawrence", 40)
        );

       /* Person result1 = persons.stream()
                .filter((p) -> "jack".equals(p.getName()) && 20 == p.getAge())
                .findAny()
                .orElse(null);*/
		
		Person result1 = persons.stream().filter(p -> p.getName().equals("jack") && p.getAge() == 20).findAny().orElse(null);

        System.out.println("result 1 :" + result1);

        //or like this
        Person result2 = persons.stream()
                .filter(p -> {
                    if ("jack".equals(p.getName()) && 20 == p.getAge()) {
                        return true;
                    }
                    return false;
                }).findAny()
                .orElse(null);
        
        String name = persons.stream().filter( p ->{
        	
        	if("naresh".equals(p.getName())) {
        		
        		return true;
        	} else {
        		return false;
        	}
        }).map(Person::getName).findAny().orElse(null);
        
        System.out.println("Name "+name);

        System.out.println("result 2 :" + result2);
	}

}
