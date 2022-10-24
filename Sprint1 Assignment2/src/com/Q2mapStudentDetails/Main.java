package com.Q2mapStudentDetails;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		Map<Student, String> tm = new TreeMap<>(new CompareByMarks());
		
		tm.put(new Student("Ketan",45, 889), "Bihar");
		tm.put(new Student("Rohit",93, 853), "Uttar Pradesh");
		tm.put(new Student("Keshri",35, 780), "Jharkhand");
		tm.put(new Student("Rahul",78, 682), "Madhya Pradesh");
		tm.put(new Student("Prashant",65, 929), "Orrisa");
		tm.put(new Student("Riku",28, 659), "Delhi");
			
		// System.out.println(tm);
		
		Set set = tm.entrySet();
		
		Iterator itr = set.iterator();
		
		while(itr.hasNext()) {
			
			Map.Entry<Student, String> me = (Map.Entry<Student, String>)itr.next();
			
			System.out.println(me.getKey()+", State ="+me.getValue());
			
		}

	}

}
