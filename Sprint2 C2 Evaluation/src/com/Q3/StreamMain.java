package com.Q3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMain {

	public static void main(String[] args) {
		
		List<Student> students = new ArrayList<>();
		
		students.add(new Student(11, "Ketan1", 560, "Siwan"));
		students.add(new Student(22, "Ketan2", 760, "Patna"));
		students.add(new Student(55, "Ketan3", 350, "Pune"));
		students.add(new Student(44, "Ketan4", 455, "Goa"));
		students.add(new Student(33, "Ketan5", 860, "Delhi"));
		
		List<Employee> employees =  students.stream().filter(m -> m.getMarks() > 500).map(e -> new Employee(e.getRoll(), e.getName(), e.getMarks()*10000, e.getAddress())).collect(Collectors.toList());
		
		employees.forEach(t -> System.out.println(t));
		
		
		
	}

}
