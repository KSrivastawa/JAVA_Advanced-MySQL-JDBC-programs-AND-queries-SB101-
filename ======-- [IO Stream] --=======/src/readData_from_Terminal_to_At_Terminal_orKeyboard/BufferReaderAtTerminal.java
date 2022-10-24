package readData_from_Terminal_to_At_Terminal_orKeyboard;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReaderAtTerminal {

	public static void main(String[] args) {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter name:");
		
		String name;
		try {
			name = reader.readLine();
			
			System.out.println("Welcome " +name);
			
		} catch (IOException e) {
			                   
			e.printStackTrace();
		}
		
			
		System.out.println("...Done!");
		

	}

}
