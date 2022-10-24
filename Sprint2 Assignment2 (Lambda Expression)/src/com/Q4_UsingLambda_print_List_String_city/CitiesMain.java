package com.Q4_UsingLambda_print_List_String_city;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CitiesMain {

	public static void main(String[] args) {
		
		// List<String> cities = Arrays.asList("Siwan", "Chappra", "Goa", "Pune");
		
		/*
		List<String> cities = new ArrayList<>();
		
		cities.add("Siwan");
		cities.add("Chappra");
		cities.add("Goa");
		
		PrintList list = s -> System.out.println(s);
		
		list.display(cities);
		
		*/
		
		PrintList list = s -> System.out.println(s);
		
		list.display(Arrays.asList("Siwan", "Chappra", "Goa", "Pune"));

	}

}
