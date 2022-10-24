package com.Q1_SortByPrice_and_Filtering;

import java.util.ArrayList;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product(11, "Rice", 40.0, 13));
		list.add(new Product(33, "Sugar", 113.0, 12));
		list.add(new Product(44, "Wheat", 23.0, 7));
		list.add(new Product(22, "Dal", 57.0, 14));
		list.add(new Product(55, "Choclate", 20.0, 9));
		
		System.out.println("Original List:");
		list.forEach(t-> System.out.println(t));
		
		System.out.println("----------------------------------------------------------------");
		
		System.out.println("Filtered List:");
		list.stream()
		.filter(s -> s.getQuantity()>10)
		.sorted((o1, o2)-> o1.getPrice() > o2.getPrice() ? +1: -1 )
		.forEach(t -> System.out.println(t)); 
		

	}

}
