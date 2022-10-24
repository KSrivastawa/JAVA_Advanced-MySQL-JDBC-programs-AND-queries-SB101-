package com.Q1_Creating_NewFile_and_WritingText_UsingSanner;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteEmployeeName_Address_inNew_File {

	public static void main(String[] args) {
		
		File file = new File("abc.txt");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Employee Details;");
		
		System.out.println("Enter Name:");
		String name = sc.next();
		
		System.out.println("Enter Address:");
		System.out.println("Enter City:");
		String city = sc.next();
		
		System.out.println("Enter State:");
		String state = sc.next();
		
		try {
			file.createNewFile();
			
			// FileWriter writer = new FileWriter(file);  // this will replace the previous data on every new entry
			
			FileWriter writer = new FileWriter(file, true);  // this will keep adding previous data with new data
			
			writer.write("\nEmployee Details:\n");
			writer.write("-------------------\n");
			
			writer.write("Name: "+name+"\n");
			writer.write("Address: ");
			writer.write(city+", ");
			writer.write(state+"\n");
	
			
			writer.flush();
			writer.close();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		System.out.println("...Done!");
		
		sc.close();

	}

}
