package create_or_find_New_Files_and_Folder;

import java.io.File;

public class FileRefenceLIST {

	public static void main(String[] args) {
		
		File file = new File("E:");
		
		File[] f = file.listFiles();
		
		for(File fi : f) {
			
			System.out.println(fi);
		}

	}

}
