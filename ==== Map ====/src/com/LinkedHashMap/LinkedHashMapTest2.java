package com.LinkedHashMap;

// Example:remove():

import java.util.*;
public class LinkedHashMapTest2 {

	public static void main(String[] args) {

		Map<Integer, String> lhm = new LinkedHashMap<>();
		
		lhm.put(5, "RR");
		lhm.put(6, "KK");
		lhm.put(1, "PP");
		lhm.put(2, "AA");
		lhm.put(3, "DD");
		lhm.put(4, "BB");
		
		System.out.println(lhm);  // {5=RR, 6=KK, 1=PP, 2=AA, 3=DD, 4=BB}
		
		// removing elements
		
		lhm.remove(3);
		System.out.println(lhm);  // {5=RR, 6=KK, 1=PP, 2=AA, 4=BB}
		
		lhm.remove(4, "BB");
		System.out.println(lhm);  // {5=RR, 6=KK, 1=PP, 2=AA}
		

	}

}
