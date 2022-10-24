package com.Q3_LibraryManagementSystem;

import java.util.Comparator;

public class CompareByDate implements Comparator<Members> {

	@Override
	public int compare(Members o1, Members o2) {
		
		return o1.getMemebershipEndDate().compareTo(o2.getMemebershipEndDate());
		
	}

}
