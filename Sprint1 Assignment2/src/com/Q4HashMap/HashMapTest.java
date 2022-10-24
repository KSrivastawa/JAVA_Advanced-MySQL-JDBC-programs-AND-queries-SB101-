package com.Q4HashMap;

import java.util.*;
import java.util.Map.Entry;

public class HashMapTest {

	public static void main(String[] args) {
		
		Map<String, Student> hm = new HashMap<>();
		
		hm.put("Bihar", new Student(45, "Ketan1", 456));
		hm.put("Uttar Pradesh", new Student(65, "Ketan2", 556));
		hm.put("Delhi", new Student(43, "Ketan3", 756));
		hm.put("Madhya Pradesh", new Student(75, "Ketan4", 656));
		hm.put("Madhya Pradesh", new Student(75, "Ketan4", 956));

		
		/*
		for(Map.Entry<String, Student> me : hm.entrySet()) {
			
			System.out.println(me.getKey()+"-> "+me.getValue());
			
		}
		*/
		
		List<Map.Entry<String, Student>> list = new LinkedList<Map.Entry<String, Student>>((Collection<? extends Entry<String, Student>>) hm);
		
		
		Collections.sort(list, new Comparator<Map.Entry<String, Student>>() {

			@Override
			public int compare(Entry<String, Student> o1, Entry<String, Student> o2) {
				
				return o1.getValue().getMarks() < o2.getValue().getMarks() ? +1: -1;
			}
		});
		
		
		Map<String, Student> hm2 = new LinkedHashMap<>();
		
		for(Map.Entry<String, Student> me : list) {
			
			hm2.put(me.getKey(), me.getValue());
			
			System.out.println(hm2);
		}
		
		
		
		
	}


	
}
