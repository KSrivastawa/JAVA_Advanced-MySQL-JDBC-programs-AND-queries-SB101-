package com.Q4MapInDescendingOrder;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapInDescending {

	public static void main(String[] args) {
		
		Map<States, Cities> lhm = new LinkedHashMap<>();
		
		lhm.put(new States("Bihar"), new Cities("Patna","Siwan","Chappra"));
		lhm.put(new States("U.P."), new Cities("Luknow","Gorakhpur","Deoria"));
		lhm.put(new States("Jharkhand"), new Cities("Murmu","Ranchi","Jamshedpur"));
		lhm.put(new States("West Bengal"), new Cities("Kolkata","Khargpur","Haowrah"));
		
		Map<States, Cities> tm = new TreeMap<>(lhm);
		
		System.out.println(tm);
	
	}

}
