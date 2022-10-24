package com.Q5;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Demo1 {

	public static void main(String[] args) {
		
		List<Student> list = new ArrayList<>();
		
		list.add(new Student(11, "Ketan", 789, "ketan@gmail.com", null, new Address("Bihar", "Siwan", "841226")));
		list.add(new Student(22, "Rohit", 657, "rohit@gmail.com", null, new Address("Bihar", "Chappra", "841755")));
		list.add(new Student(33, "Kesri", 852, "kesri@gmail.com", null, new Address("Madhya Pradesh", "Indore", "741454")));
		list.add(new Student(44, "Aman", 325, "aman@gmail.com", null, new Address("Delhi", "Palika", "641226")));
		list.add(new Student(55, "Raja", 489, "raja@gmail.com", null, new Address("Uttar Pradesh ", "Gorakhpur", "254226")));
		
		
		try {
			ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream("studentdata.txt"));
			
			stream.writeObject(list);
			
			
			stream.close();
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
		
		System.out.println("...Done!");
		
		
		
		
	}

}
