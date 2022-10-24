package com.Q4_CollectionSet_FilteredByMarks;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class FilteredMarksFromSet {

	public static void main(String[] args) {
		
		Set<StudentStream> studentStreams = new HashSet<>();
		
		studentStreams.add(new StudentStream(11, "Ketan", 580));
		studentStreams.add(new StudentStream(22, "Prashant", 480));
		studentStreams.add(new StudentStream(33, "Riku", 720));
		studentStreams.add(new StudentStream(55, "Rick", 630));
		studentStreams.add(new StudentStream(44, "Big-Hitter", 370));

		
		System.out.println("Original List:");
		studentStreams.forEach(t -> System.out.println(t));
		
		System.out.println();
		
		Set<StudentStream> filteredSet = studentStreams.stream().filter( f -> f.getMarks() < 500).distinct().collect(Collectors.toSet());
		
		System.out.println("Filtered list:");
		filteredSet.forEach( t -> System.out.println(t));		

	}

}
