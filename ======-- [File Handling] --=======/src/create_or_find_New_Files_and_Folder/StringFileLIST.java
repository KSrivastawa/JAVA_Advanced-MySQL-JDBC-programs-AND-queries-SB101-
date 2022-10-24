package create_or_find_New_Files_and_Folder;

import java.io.File;

public class StringFileLIST {

	public static void main(String[] args) {
		
		File file = new File("E:");
		
		String[] str = file.list();
		
		for(String s : str) {
			
			System.out.println(s);
			
		}

	}

}
