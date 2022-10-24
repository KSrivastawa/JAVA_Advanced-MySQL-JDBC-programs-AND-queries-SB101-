package create_or_find_New_Files_and_Folder;

import java.io.File;
import java.io.IOException;

public class MainFile4 {

	public static void main(String[] args) throws IOException {
		
		File file1 = new File("E://myCreatedFiles//a1.css");
		
		file1.createNewFile();
		
		System.out.println(file1.exists());  // throws exception

	}

}
