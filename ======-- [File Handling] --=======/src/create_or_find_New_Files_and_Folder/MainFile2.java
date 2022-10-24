package create_or_find_New_Files_and_Folder;

import java.io.File;
import java.io.IOException;

public class MainFile2 {

	public static void main(String[] args) throws IOException {

		File file = new File("E:"); // File Parent file name
		
		File file1 = new File(file, "abc1.java"); // Child of parent
		
		File file2 = new File(file, "abc2.html");  // // Child of parent
		
		file1.createNewFile();
		file2.createNewFile();
		
		System.out.println(file1.exists());
		System.out.println(file2.exists());
		
	}

}
