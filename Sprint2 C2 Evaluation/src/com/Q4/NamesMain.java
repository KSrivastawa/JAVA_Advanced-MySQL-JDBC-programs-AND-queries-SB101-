package com.Q4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NamesMain {

	public static void main(String[] args) {
		
		// list of 10 names
		
		List<String> names = Arrays.asList
				("ketan", "rohit", "keshri", "rudra", "priya", "kajal", "sona", "rash", "tushar", "aman");
		
		System.out.println("Original list:");
		System.out.println("---------------");
		names.forEach(o -> System.out.println(o));
		
		System.out.println("=================");
		
		List<String>  transformedNames	= names.stream().filter(l -> l.length()%2 ==0).map(u -> u.toUpperCase()).collect(Collectors.toList());
 
		System.out.println("Transformed list:");
		System.out.println("---------------");
		transformedNames.stream().sorted((o1, o2) -> o2.compareTo(o1)).forEach(p -> System.out.println(p));
		
		
	}

}
