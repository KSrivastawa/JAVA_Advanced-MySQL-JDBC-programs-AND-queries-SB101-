package com.Q5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class Demo2 {

	public static void main(String[] args) {
		
		try {
			ObjectInputStream stream = new ObjectInputStream(new FileInputStream("studentdata.txt"));
			
			try {
				List<Student> list = (List<Student>)stream.readObject();
				
				list.add(new Student(66, "Ravi", 785, "ravi@gmail.com", null, new Address("Utrakhand", "Haridwar", "785545")));
				
				
				
				list.forEach(s -> System.out.println(s));
				
			} catch (ClassNotFoundException e) {
				
				e.printStackTrace();
			}
			
			
			stream.close();
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		

	}

}
