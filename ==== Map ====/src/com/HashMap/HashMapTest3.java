package com.HashMap;

// Different ways to remove elements:

import java.util.*;

public class HashMapTest3 {

	public static void main(String[] args) {
		
		Map<Integer, String> hm = new HashMap<>();
		
		hm.put(1, "Hum");
		hm.put(2, "tum");
		hm.put(5, "Me");
		hm.put(3, "Ek");
		hm.put(4, "Kamre");
		hm.put(7, "Ho");
		hm.put(6, "Band");
		
		System.out.println(hm);  // {1=Hum, 2=tum, 3=Ek, 4=Kamre, 5=Me, 6=Band, 7=Ho}
		
		hm.remove(3);
		System.out.println(hm);  // {1=Hum, 2=tum, 4=Kamre, 5=Me, 6=Band, 7=Ho}
		
		hm.remove("Ho");  // *by value cannot remove ---
		System.out.println(hm);  // {1=Hum, 2=tum, 4=Kamre, 5=Me, 6=Band, 7=Ho}
		
		hm.remove(7, "Ho");
		System.out.println(hm);  // {1=Hum, 2=tum, 4=Kamre, 5=Me, 6=Band}
		
		
		

	}

}
