package com.genericMethod;

public class Main {

	public static <T> void fun1(T t) {
		
		System.out.println("fun1 T");
		System.out.println(t +"\n");
		
	}
	
	public static void main(String[] args) {

		Main.fun1(null);
		fun1(45);
		fun1("Ketan");
		fun1(new Student(45, "Ketan", 96));
		

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
