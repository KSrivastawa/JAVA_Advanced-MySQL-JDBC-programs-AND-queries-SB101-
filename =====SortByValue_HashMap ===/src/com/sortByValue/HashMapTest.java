package com.sortByValue;

import java.util.*;
import java.util.Map.Entry;

public class HashMapTest {
	
	private static Map<String, Student> sortByMarks(Map<String, Student> hm) {
		
		List<Map.Entry<String, Student>> list = new LinkedList<Map.Entry<String, Student>>(hm.entrySet());
		
		Collections.sort(list, new Compare());
		
		/*
		Collections.sort(list, new Comparator<Map.Entry<String, Student>>() {

			@Override
			public int compare(Map.Entry<String, Student> o1, Map.Entry<String, Student> o2) {
				
				return o1.getValue().getMarks()>(o2.getValue().getMarks()) ? +1 :-1;
			}
			
		});
		*/
		
		Map<String, Student> hm3 = new LinkedHashMap<>();
		
		for(Map.Entry<String, Student> me : list) {
			
			hm3.put(me.getKey(), me.getValue());
		}
		
		
		return hm3;
	}


	public static void main(String[] args) {
		
		Map<String, Student> hm = new HashMap<>();
		
		hm.put("Bihar", new Student(45, "Ketan1", 456));
		hm.put("Uttar Pradesh", new Student(65, "Ketan2", 556));
		hm.put("Delhi", new Student(43, "Ketan3", 356));
		hm.put("Madhya Pradesh", new Student(75, "Ketan4", 656));
		hm.put("Madhya Pradesh", new Student(75, "Ketan4", 956));

		
		Map<String, Student> hm2 = sortByMarks(hm);
		
		for(Map.Entry<String, Student> me : hm2.entrySet()) {
			
			System.out.println(me.getKey() + " - "+ me.getValue());
			
		}
		
		
	}

	

	
}
