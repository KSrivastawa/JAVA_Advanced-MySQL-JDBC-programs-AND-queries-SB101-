package create_or_find_New_Files_and_Folder;

import java.io.File;
import java.io.IOException;

public class MainFile3 {

	public static void main(String[] args) throws IOException {
		
		File file = new File("E:","www.helloworld.com");
		
		File file1 = new File("www.helloworld.com");
		
		file.createNewFile();
		file1.createNewFile();

		System.out.println(file.exists());
		System.out.println(file1.exists());
		
		

	}

}
