package com.Q2mapStudentDetails;

import java.util.Comparator;

public class CompareByMarks implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		
		if(o1.getMarks()> o2.getMarks()) {
			return +1;
		}
		else if(o1.getMarks()< o2.getMarks()) {
			return -1;
		}
		return 0;
		
	}

	
	
}
