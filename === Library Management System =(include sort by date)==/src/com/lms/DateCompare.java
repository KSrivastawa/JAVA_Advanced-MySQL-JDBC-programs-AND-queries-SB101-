package com.lms;

import java.util.Comparator;

public class DateCompare implements Comparator<Members> {

	@Override
	public int compare(Members o1, Members o2) {
		
		return o1.getMembershipEndDate().compareTo(o2.getMembershipEndDate());
	}
	

}
