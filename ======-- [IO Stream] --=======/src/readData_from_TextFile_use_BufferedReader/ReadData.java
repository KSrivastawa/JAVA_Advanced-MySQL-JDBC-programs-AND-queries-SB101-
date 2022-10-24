package readData_from_TextFile_use_BufferedReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadData {

	public static void main(String[] args) {
		
		try {
			
			FileReader file = new FileReader("abc.txt");

			BufferedReader reader = new BufferedReader(file);
			
			String line = reader.readLine();
			
			while(line != null) {
				System.out.println(line);
				
				line = reader.readLine();
				
			}
			
			reader.close();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		System.out.println("...all Read!");
		

	}

}
