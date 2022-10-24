package com.pq;

import java.util.Comparator;

public class CompareByMarks implements Comparator<Students> {

	@Override
	public int compare(Students o1, Students o2) {
		
		return o1.getMarks()-o2.getMarks();
		
	}

	
	
}
