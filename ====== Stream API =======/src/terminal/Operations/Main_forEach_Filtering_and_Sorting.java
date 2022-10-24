package terminal.Operations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main_forEach_Filtering_and_Sorting {

	public static void main(String[] args) {
		

		List<Integer> integers = Arrays.asList(4,98,6,4,52);
		
		integers.stream().map(s-> s+4).forEach(t -> System.out.println(t));
				
		// for student
		
		List<Student_forEach> students = new ArrayList<>();
		
		students.add(new Student_forEach(22, "Ketan", 600));
		students.add(new Student_forEach(11, "Prashant", 435));
		students.add(new Student_forEach(55, "Riku", 560));
		students.add(new Student_forEach(44, "Big-Hiter", 355));
		students.add(new Student_forEach(33, "Ricks", 258));
		
		// Sorting by descending order
		students.stream().sorted((o1, o2) -> o2.getMarks()> o1.getMarks() ? +1:-1).forEach(s -> System.out.println(s));
		
		/* Sorting descending output:
		 	Student_forEach [roll=22, name=Ketan, marks=600]
			Student_forEach [roll=55, name=Riku, marks=560]
			Student_forEach [roll=11, name=Prashant, marks=435]
			Student_forEach [roll=44, name=Big-Hiter, marks=355]
			Student_forEach [roll=33, name=Ricks, marks=258]
		 */
			System.out.println(); // for gap
		// print student details whose marks is above 500
		students.stream().filter(s -> s.getMarks()> 500).forEach(t -> System.out.println(t));
		
		/* filter output: 
		 Student_forEach [roll=22, name=Ketan, marks=600]
		 Student_forEach [roll=55, name=Riku, marks=560]
		 */
		
		
		System.out.println(); // for gap
		students.stream().filter(t -> t.getMarks()< 500).sorted((o1, o2) -> o2.getMarks() < o1.getMarks() ? +1:-1).forEach(s -> System.out.println(s));
		
		/*  filtering and then sorting 
		 * output:
		 Student_forEach [roll=33, name=Ricks, marks=258]
		 Student_forEach [roll=44, name=Big-Hiter, marks=355]
		 Student_forEach [roll=11, name=Prashant, marks=435]
		 */
	}

}
