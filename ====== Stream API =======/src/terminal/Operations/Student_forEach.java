package terminal.Operations;

public class Student_forEach {

	private int roll;
	private String name;
	private int marks;

	public Student_forEach(int roll, String name, int marks){
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
		
	}

	public int getRoll() {
		return roll;
	}

	public String getName() {
		return name;
	}

	public int getMarks() {
		return marks;
	}

	@Override
	public String toString() {
		return "Student_forEach [roll=" + roll + ", name=" + name + ", marks=" + marks + "]";
	}
	
	
	

}
