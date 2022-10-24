package com.TreeMap;

// remove Entry
import java.util.*;

public class TreeMapTest2 {

	public static void main(String[] args) {
		
		Map<Integer, String> tm = new TreeMap<Integer, String>();
		
		tm.put(2, "A");
		tm.put(5, "B");
		tm.put(1, "C");
		tm.put(6, "T");
		tm.put(3, "D");
		tm.put(8, "G");
		tm.put(9, "S");
		tm.put(7, "K");
		
		System.out.println(tm);  // {1=C, 2=A, 3=D, 5=B, 6=T, 7=K, 8=G, 9=S}
		
		tm.remove(5);
		tm.remove(1);
		System.out.println(tm);  // {2=A, 3=D, 6=T, 7=K, 8=G, 9=S}
		

		
		
		
		
		

	}

}
