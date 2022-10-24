package com.TreeMap;

import java.util.*;

public class TreeMapTest3 {

	public static void main(String[] args) {
		
		NavigableMap<Integer, String> tm = new TreeMap<Integer, String>();
		
		tm.put(2, "A");
		tm.put(5, "B");
		tm.put(1, "C");
		tm.put(6, "T");
		tm.put(3, "D");
		tm.put(8, "G");
		tm.put(9, "S");
		tm.put(7, "K");
		
		System.out.println(tm);  // {1=C, 2=A, 3=D, 5=B, 6=T, 7=K, 8=G, 9=S}
		
		System.out.println("Descending order: "+ tm.descendingMap()); // Descending order: {9=S, 8=G, 7=K, 6=T, 5=B, 3=D, 2=A, 1=C}

		//Returns key-value pairs whose keys are less than or equal to the specified key.
		System.out.println("HeadMap: "+ tm.headMap(6, true));  // HeadMap: {1=C, 2=A, 3=D, 5=B, 6=T}
		
		System.out.println("HeadMap: "+ tm.headMap(6, false));  // HeadMap: {1=C, 2=A, 3=D, 5=B}

		
		//Returns key-value pairs whose keys are greater than or equal to the specified key.
		System.out.println("TailMap: "+ tm.tailMap(3, true));  // TailMap: {3=D, 5=B, 6=T, 7=K, 8=G, 9=S}
		
		System.out.println("TailMap: "+ tm.tailMap(3, false));  // TailMap: {5=B, 6=T, 7=K, 8=G, 9=S}

		
		//Returns key-value pairs exist in between the specified key.
		System.out.println("SubMap: "+ tm.subMap(3, true, 8, true)); //  SubMap: {3=D, 5=B, 6=T, 7=K, 8=G}
		
		System.out.println("SubMap: "+ tm.subMap(3, false, 8, false)); //  SubMap: {5=B, 6=T, 7=K}

		
		// without boolean
		
		System.out.println("HeadMap: "+ tm.headMap(6));  // HeadMap: {1=C, 2=A, 3=D, 5=B}
		
		System.out.println("TailMap: "+ tm.tailMap(3)); //  TailMap: {3=D, 5=B, 6=T, 7=K, 8=G, 9=S}
		
		System.out.println("SubMap: "+ tm.subMap(3, 8));  // SubMap: {3=D, 5=B, 6=T, 7=K}
		
	}

}
