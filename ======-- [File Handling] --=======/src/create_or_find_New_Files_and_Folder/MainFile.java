package create_or_find_New_Files_and_Folder;

import java.io.File;
import java.io.IOException;

public class MainFile {

	public static void main(String[] args) throws IOException {
		
		File file = new File("abc1.txt");
		
		System.out.println(file);
		
		System.out.println(file.exists());

		file.createNewFile();
		
		System.out.println(file.exists());
		
		

	}

}
