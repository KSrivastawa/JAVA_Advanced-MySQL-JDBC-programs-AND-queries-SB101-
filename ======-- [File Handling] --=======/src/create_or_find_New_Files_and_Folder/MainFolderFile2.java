package create_or_find_New_Files_and_Folder;

import java.io.File;
import java.io.IOException;

public class MainFolderFile2 {

	public static void main(String[] args) throws IOException {
		
		File file = new File("E://myCreatedFolder");
		
		file.mkdir();
		
		File file2 = new File(file, "CSS.css");
		
		file2.createNewFile();
		
		System.out.println(file2.exists());

	}

}
