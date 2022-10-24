package create_or_find_New_Files_and_Folder;

import java.io.File;
import java.io.IOException;

public class Using_IF_Else_CreatingFiles {

	public static void main(String[] args) throws IOException {
		
		File file = new File("a1");
		
		if(file.createNewFile()) {
			System.out.println("File is created!");
		}
		else {
			System.out.println("File already exist...!");
		}
		

	}

}
