package com.generics;

/*
 	Demo<Integer> d = new Demo<>();
 	Demo<String> d = new Demo<>();
 	Demo<Student> d = new Demo<>();
 	
 */


public class Main {

	public static void main(String[] args) {

		MyGen<Integer> integer = new MyGen<>(12);
		System.out.println(integer.getData());
		System.out.println(); // for line gap
		
		MyGen<String> string = new MyGen<>("Ketan");
		System.out.println(string.getData());
		System.out.println(); // for line gap
		
		MyGen<Student> student = new MyGen<>(new Student(45,"Ketan", 789));
		System.out.println(student.getData());
		System.out.println(); // for line gap
		

	}

}

class MyGen<T> {
	
	T data;
	
	public MyGen(T data) {

		this.data = data;
	}
	
	public T getData() {
		return data;
			
	}
	

}


class Student {

	int roll;
	String name;
	int marks;
	
	
	public Student(int roll, String name, int marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}


	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + "]";
	}


	
}




