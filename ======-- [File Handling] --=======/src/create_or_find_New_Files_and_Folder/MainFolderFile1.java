package create_or_find_New_Files_and_Folder;

import java.io.File;

public class MainFolderFile1 {

	public static void main(String[] args) {
		
		File file = new File("E://myCreatedFile");
		
		file.mkdir();
		
		System.out.println(file.exists());

	}

}
