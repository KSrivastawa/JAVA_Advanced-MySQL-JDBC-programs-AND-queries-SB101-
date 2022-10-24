package com.HashMap;

// Different ways to replace elements:

import java.util.*;

public class HashMapTest4 {

	public static void main(String[] args) {
		
		Map<Integer, String> hm = new HashMap<>();
		
		hm.put(3, "Rose");
		hm.put(5, "Lotus");
		hm.put(2, "Sunflower");
		hm.put(1, "Genda");
		hm.put(4, "Lily");
		
		System.out.println(hm);  // {1=Genda, 2=Sunflower, 3=Rose, 4=Lily, 5=Lotus}
		
		for(Map.Entry<Integer, String> me : hm.entrySet()) {
			
			System.out.println("Key: "+me.getKey()+" "+ "Value: "+me.getValue());
		}
		
		System.out.println("After replace:");
		
		hm.replace(1, "Tree");  // replacing elements value
		for(Map.Entry<Integer, String> me : hm.entrySet()) {
			
			System.out.println("Key: "+me.getKey()+" "+ "Value: "+me.getValue());
		}
		/*
		 After replace:
			Key: 1 Value: Tree
			Key: 2 Value: Sunflower
			Key: 3 Value: Rose
			Key: 4 Value: Lily
			Key: 5 Value: Lotus
		 */
		
		System.out.println("After replace:");
		
		hm.replace(3, "Rose", "ROSE");  // // replacing elements old to new value
		for(Map.Entry<Integer, String> me : hm.entrySet()) {
			
			System.out.println("Key: "+me.getKey()+" "+ "Value: "+me.getValue());
		}
		/*
		 After replace:
			Key: 1 Value: Tree
			Key: 2 Value: Sunflower
			Key: 3 Value: ROSE
			Key: 4 Value: Lily
			Key: 5 Value: Lotus
		 */
		
		
		System.out.println("After replaceAll:");
		
		hm.replaceAll((Integer,String)-> "ABC");
		for(Map.Entry<Integer, String> me : hm.entrySet()) {
			
			System.out.println("Key: "+me.getKey()+" "+ "Value: "+me.getValue());
		}
		/*
		 After replaceAll:
			Key: 1 Value: ABC
			Key: 2 Value: ABC
			Key: 3 Value: ABC
			Key: 4 Value: ABC
			Key: 5 Value: ABC
		 */
		

	}

}
