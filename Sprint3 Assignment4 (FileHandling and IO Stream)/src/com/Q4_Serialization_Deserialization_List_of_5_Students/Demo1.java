package com.Q4_Serialization_Deserialization_List_of_5_Students;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Demo1 {

	public static void main(String[] args) {
		
		Student student1 = new Student(11, "Ketan", 456, new Address("Siwan","Bihar",841226));
		Student student2 = new Student(12, "Prashant", 589, new Address("Bhatwalia","Bihar",841227));
		
		List<Student> list = new ArrayList<>();
		
		list.add(student1);
		list.add(student2);
		
		try {
			ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream("student.txt"));
			
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
