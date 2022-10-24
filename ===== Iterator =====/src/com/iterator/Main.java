package com.iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Main {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("a","b","c","d","e");
		
		Iterator<String> itr = list.iterator();

		while(itr.hasNext()) {
			
			String s = itr.next();
			
			System.out.println(s);
			
		}
		
	}

}

class Main2{
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Ketan1");
		list.add("Ketan2");
		list.add("Ketan3");
		list.add("Ketan4");
		list.add("Ketan5");
		
		// forward order
		ListIterator<String> itr = list.listIterator();
		
		while(itr.hasNext()) {
			
			String asc = itr.next();
			
			System.out.println(asc);
			
			
		}
		
		System.out.println("===============");
		
		
		// backward order
				
				while(itr.hasPrevious()) {
					
					System.out.println(itr.previous());
					
					
				}
 		
		// this is possible when hasNext() is applied before applying hasPreviuos().
		
	}
	
}
