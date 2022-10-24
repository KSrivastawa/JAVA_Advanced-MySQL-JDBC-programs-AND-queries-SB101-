package com.Q2_Maximum_Marks_Student;

import java.util.*;

public class MaxStudent {

	public static void main(String[] args) {

		List<Student> studentStreams = new ArrayList<>();

		studentStreams.add(new Student(11, "Ketan", 580));
		studentStreams.add(new Student(22, "Prashant", 480));
		studentStreams.add(new Student(33, "Riku", 720));
		studentStreams.add(new Student(55, "Rick", 630));
		studentStreams.add(new Student(44, "Big-Hitter", 370));
		
		Student maxStudent = studentStreams.stream().max((o1, o2) -> o1.getMarks() > o2.getMarks() ? +1 :-1).get();
		
		System.out.println(maxStudent);
		
	}

}
