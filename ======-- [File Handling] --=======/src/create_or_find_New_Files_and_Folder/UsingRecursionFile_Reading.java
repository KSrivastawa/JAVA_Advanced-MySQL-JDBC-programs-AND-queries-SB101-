package create_or_find_New_Files_and_Folder;

import java.io.File;

public class UsingRecursionFile_Reading {
	
	public static void readingFile(File file) {
		
		File[] f = file.listFiles();
		
		for(File fi : f) {
			if(fi.isDirectory()) {
				readingFile(fi);
			}
			else {
				System.out.println(fi.getName());
			}
			
		}
		
	}

	public static void main(String[] args) {
		
		File file = new File("E://myCreatedFiles");
		
		readingFile(file);

	}

}
