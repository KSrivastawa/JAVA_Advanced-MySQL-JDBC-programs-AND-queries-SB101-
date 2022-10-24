package converting_ArrayList_to_HashMap;

import java.util.*;

public class Main {

	private int x;
	private String s;
	
	public Main(int x, String s) {
		super();
		this.x = x;
		this.s = s;
	}
	
	
	public int getX() {
		return x;
	}


	public String getS() {
		return s;
	}


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			
		System.out.println("Enter No. of times need to add values:");
		int numbersOfValue = sc.nextInt();
		
		List<Main> list = new ArrayList<>();
		
		int c=0;
		for(int i=0; i<numbersOfValue; i++) {
			System.out.println("Enter values "+ ++c+":");
			
			System.out.println("Enter Integer Value: ");
			int num = sc.nextInt();
			
			System.out.println("Enter String Value:");
			String str = sc.next();
			
			list.add(new Main(num, str));
			
			
		}
		
		Map<Integer, String> hm = new HashMap<>(); 
		
		list.forEach( (main) -> hm.put( main.getX(), main.getS() ) ); 
		
		System.out.println("Map: "+hm);

	}

}



