package com.lms;

import java.util.*;

public class Main2 {

	public static void main(String[] args) {
		
		 ArrayList<DateItems> dateList = new ArrayList<>();
		 
	        dateList.add(new DateItems("2020-03-25"));
	        dateList.add(new DateItems("2019-01-27"));
	        dateList.add(new DateItems("1998-01-27"));
	        dateList.add(new DateItems("1998-02-26"));
	        
	        Collections.sort(dateList, new DateComp());
	        
	        for( DateItems d : dateList) {
	        	
	        	System.out.println(d.membershipEndDate);
	        }

	}

}
