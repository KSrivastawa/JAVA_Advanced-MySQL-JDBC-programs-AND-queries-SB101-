package com.lms;

import java.util.Comparator;

public class DateComp implements Comparator<DateItems> {

	@Override
	public int compare(DateItems o1, DateItems o2) {
		
		 return o1.membershipEndDate.compareTo(o2.membershipEndDate);
	}

}
