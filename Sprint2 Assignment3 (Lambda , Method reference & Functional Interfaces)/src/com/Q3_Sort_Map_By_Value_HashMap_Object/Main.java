package com.Q3_Sort_Map_By_Value_HashMap_Object;

import java.util.*;
import java.util.Map.Entry;

public class Main {

	public static void main(String[] args) {
		
		Map<String, Student> hm = new HashMap<>();
		
		hm.put("India", new Student(11, "Ketan1", "kt.ketansri1@gmail.com", 451));
		hm.put("Aus", new Student(22, "Ketan2", "kt.ketansri2@gmail.com", 352));
		hm.put("Japan", new Student(11, "Ketan6", "kt.ketansri3@gmail.com", 455));
		hm.put("England", new Student(44, "Ketan9", "kt.ketansri4@gmail.com", 556));
		hm.put("Canada", new Student(55, "Ketan5", "kt.ketansri5@gmail.com", 457));
		
		
		List<Map.Entry<String, Student>> list = new LinkedList<Map.Entry<String, Student>>(hm.entrySet());
		
		Collections.sort(list, (o1, o2)-> (o2.getValue().getName().compareToIgnoreCase(o1.getValue().getName()) ));
		
		 list.forEach(x -> System.out.println(x));
		
		Map<String, Student> map = new LinkedHashMap<>();
		
		for(Entry<String, Student> list2 : list) {
			
			map.put(list2.getKey(), list2.getValue());
		}
		
		Intr intr = originalMap -> originalMap;
		
		System.out.println(intr.sortMapUsingStudentName(map));
		
		
	}

}
