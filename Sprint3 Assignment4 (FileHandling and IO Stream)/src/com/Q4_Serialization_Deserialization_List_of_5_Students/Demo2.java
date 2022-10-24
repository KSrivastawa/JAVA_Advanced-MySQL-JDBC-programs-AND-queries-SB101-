package com.Q4_Serialization_Deserialization_List_of_5_Students;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class Demo2 {

	public static void main(String[] args) {
		
		try {
			ObjectInputStream obj = new ObjectInputStream(new FileInputStream("student.txt"));
			
			try {
			     List<Student> list = (List<Student>)obj.readObject();
			     
			     list.forEach(a -> System.out.println(a));
			
			     
			} catch (ClassNotFoundException e) {
				
				e.printStackTrace();
			}
		
			
			obj.close();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		System.out.println("done...");

	}

}
