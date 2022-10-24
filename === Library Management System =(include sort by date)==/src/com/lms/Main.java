package com.lms;

import java.util.*;

public class Main {
	
	public static void displayMebersDetails(Collection<Members> members) {
		
		List<Members> set = new ArrayList<>(members);
		
		Collections.sort(set, new DateCompare());
		
		for(Members list: set) {
			
			System.out.println(list);
		}
		
	}

	public static void main(String[] args) {
		
		Set<Members> list = new HashSet<Members>();
		
		list.add(new Members(11,"Ketan1", 3, "2022-01-27"));
		list.add(new Members(22,"Ketan2", 5, "2022-03-25"));
		list.add(new Members(33,"Ketan3", 4, "2022-02-21"));
		list.add(new Members(44,"Ketan4", 3, "2022-09-13"));
		list.add(new Members(22,"Ketan5", 5, "2022-10-23"));
		list.add(new Members(77,"Ketan6", 2, "2021-08-10"));
		list.add(new Members(66,"Ketan7", 2, "2021-08-10"));
		
		displayMebersDetails(list);

	}

}
