package instance_method_of_an_arbitrary_object_of_a_particular_type;

public class ArbitraryObject {

	private String str = null;

	public ArbitraryObject(String s) {
		this.str = s;
	}

	void someInstanceMethod() {
		
		System.out.print(this.str + " ");
		
	}

	public String getS() {
		return str;
	}
	
}
