package com.Q3_LibraryManagementSystem;

import java.util.*;

public class Main {
	
	
	public static void main(String[] args) {
		
		Set<Books> set = new LinkedHashSet<>();
		
		set.add(new Books(11, "Ramayan", "TulsiDas"));
		set.add(new Books(22, "Mahabharat", "VedVyas"));
		set.add(new Books(44, "Ramayan1", "TulsiDas3"));
		set.add(new Books(11, "Ramayan", "TulsiDas"));
		set.add(new Books(55, "Ramayan", "TulsiDas4"));
		set.add(new Books(33, "Ramayan3", "TulsiDas4"));
		set.add(new Books(33, "Ramayan3", "TulsiDas4"));
		
		List<Books> list = new ArrayList<>(set);
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("=================================================");
		
		Set<Members> set2 = new LinkedHashSet<>();
		
		set2.add(new Members(11,25873,"Ketan", "10/10/2022"));
		set2.add(new Members(22,25863,"Ketan1","11/12/2022"));
		set2.add(new Members(33,25893,"Ketan2","26/10/2023"));
		set2.add(new Members(55,25863,"Ketan5","09/10/2023"));
		set2.add(new Members(77,25873,"Ketan6","17/10/2022"));
		set2.add(new Members(66,25863,"Ketan3","19/10/2022"));
		set2.add(new Members(22,25833,"Ketan4","16/10/2022"));

		
		Set<Members> set3 = new TreeSet<Members>(set2);
		
		for(Members m: set3) {
			System.out.println(m);
		}
		
		
		/*
		Iterator<Members> itr = set3.iterator();
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
			
			
		}
*/
		
	}
	
}
