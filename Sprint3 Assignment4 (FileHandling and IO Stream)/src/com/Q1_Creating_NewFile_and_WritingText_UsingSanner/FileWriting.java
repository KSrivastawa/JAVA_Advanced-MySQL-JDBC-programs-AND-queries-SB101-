package com.Q1_Creating_NewFile_and_WritingText_UsingSanner;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriting {

	public static void main(String[] args) {
		
		File source = new File("E:");
		
		File file = new File(source, "Q1_FileWriting.txt");
		
		
		
		try {
			file.createNewFile();
			
			FileWriter fileWriter = new FileWriter(file);
			
			fileWriter.write("Hello\n");
			fileWriter.write("Ketan");
			
			
			fileWriter.flush();
			fileWriter.close();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}

		System.out.println("...Done!");
	}

}
