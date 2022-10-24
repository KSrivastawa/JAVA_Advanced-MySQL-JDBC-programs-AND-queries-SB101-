package com.Q1;

import java.util.*;

public class Demo {

	public Map<Employee, String> sortMapUsingEmployeeSalary(Map<Employee,String> originalMap){
		
		Collection<Map.Entry<Employee, String>> list = new ArrayList<>(originalMap.entrySet());
		
		// Sorting by Salary
		Collections.sort((List<Map.Entry<Employee, String>>) list, new ComarebySalary());
		
		Map<Employee, String> lhm = new LinkedHashMap<>();
		
		for(Map.Entry<Employee, String> me: list) {
			
			lhm.put(me.getKey(), me.getValue());
			
		}
			

		return lhm;
		
	}

	
	public static void main(String[] args) {

		HashMap<Employee, String> hm = new HashMap<>();
		
		hm.put(new Employee(11, "Ketan1", 10000.00), "first");
		hm.put(new Employee(22, "Ketan2", 20000.00), "first");
		hm.put(new Employee(55, "Ketan5", 50000.00), "first");
		hm.put(new Employee(33, "Ketan3", 30000.00), "first");
		hm.put(new Employee(11, "Ketan1", 10000.00), "first");

		
		Demo d = new Demo();
		System.out.println(d.sortMapUsingEmployeeSalary(hm));
		
		
	}

}
