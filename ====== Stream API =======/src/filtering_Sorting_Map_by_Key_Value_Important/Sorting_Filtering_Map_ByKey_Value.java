package filtering_Sorting_Map_by_Key_Value_Important;

import java.util.*;


public class Sorting_Filtering_Map_ByKey_Value {

	public static void main(String[] args) {
		
		Map<String, Student> map = new HashMap<>();
		
		map.put("Bihar", new Student(11, "ketan", 789));
		map.put("Odissa", new Student(22, "rohit", 326));
		map.put("Ranchi", new Student(33, "Keshri", 451));
		map.put("Delhi", new Student(55, "ravci", 529));
		map.put("Pune", new Student(44, "Aman", 683));
		
		map.entrySet().forEach(t -> System.out.println(t));
		System.out.println("------------------");
		
		// filter by value.marks() 
		map.entrySet().stream().filter(t-> t.getValue().getMarks() > 500).forEach(s-> System.out.println(s));
		
		System.out.println("------------------");
		
		// filter by key() using contains()
		map.entrySet().stream().filter(t-> !t.getKey().contains("Odissa")).forEach(s-> System.out.println(s));
		
		System.out.println("------------------");
		
		// sorting by value.marks()
		map.entrySet().stream().sorted((o1, o2)-> o1.getValue().getMarks() > o2.getValue().getMarks() ? 1 : -1)
		.forEach(t -> System.out.println(t));
		
		System.out.println("------------------");
		
		map.entrySet().stream().sorted(Map.Entry.comparingByValue((o1, o2)-> o1.getMarks() > o2.getMarks() ? 1 : -1))
		.forEach(t -> System.out.println(t.getKey()+ " "+ t.getValue()));
		
		System.out.println("------------------");
		
		// sorting by key()
		map.entrySet().stream().sorted((o1,o2)-> o1.getKey().compareTo(o2.getKey())).forEach(t -> System.out.println(t));
		
		System.out.println("------------------");
		
		// filtering then sorting based on value()
		map.entrySet().stream().filter(f-> f.getValue().getMarks() > 500)
		.sorted((o1, o2)-> o1.getValue().getMarks() > o2.getValue().getMarks() ? 1 : -1)
		.forEach(p -> System.out.println(p));

		System.out.println("------------------");
		
		// filtering then sorting based on key()
		map.entrySet().stream().filter(f-> !f.getKey().contains("Pune"))
		.sorted((o1, o2)-> o1.getKey().compareTo(o2.getKey()))
		.forEach(p -> System.out.println(p));
		
		
		System.out.println("------------------");
		
		// filtering based on key and value() together then sorting based on key()
		map.entrySet().stream().filter(f-> !f.getKey().contains("Pune") && f.getValue().getMarks()> 500)
		.sorted((o1, o2)-> o1.getKey().compareTo(o2.getKey()))
		.forEach(p -> System.out.println(p));
		
		System.out.println("------------------");
		
		// filtering based on key and value() together then sorting based on value()
		map.entrySet().stream().filter(f-> !f.getKey().contains("Odissa") && f.getValue().getMarks()> 500)
		.sorted((o1, o2)-> o1.getValue().getMarks() > o2.getValue().getMarks() ? 1 : -1)
		.forEach(p -> System.out.println(p));
		
		
		
		
	}

}

// Output: 

/*
Bihar=StudentStream [roll=11, name=ketan, marks=789]
Delhi=StudentStream [roll=55, name=ravci, marks=529]
Ranchi=StudentStream [roll=33, name=Keshri, marks=451]
Pune=StudentStream [roll=44, name=Aman, marks=683]
Odissa=StudentStream [roll=22, name=rohit, marks=326]
------------------
Bihar=StudentStream [roll=11, name=ketan, marks=789]
Delhi=StudentStream [roll=55, name=ravci, marks=529]
Pune=StudentStream [roll=44, name=Aman, marks=683]
------------------
Bihar=StudentStream [roll=11, name=ketan, marks=789]
Delhi=StudentStream [roll=55, name=ravci, marks=529]
Ranchi=StudentStream [roll=33, name=Keshri, marks=451]
Pune=StudentStream [roll=44, name=Aman, marks=683]
------------------
Odissa=StudentStream [roll=22, name=rohit, marks=326]
Ranchi=StudentStream [roll=33, name=Keshri, marks=451]
Delhi=StudentStream [roll=55, name=ravci, marks=529]
Pune=StudentStream [roll=44, name=Aman, marks=683]
Bihar=StudentStream [roll=11, name=ketan, marks=789]
------------------
Odissa StudentStream [roll=22, name=rohit, marks=326]
Ranchi StudentStream [roll=33, name=Keshri, marks=451]
Delhi StudentStream [roll=55, name=ravci, marks=529]
Pune StudentStream [roll=44, name=Aman, marks=683]
Bihar StudentStream [roll=11, name=ketan, marks=789]
------------------
Bihar=StudentStream [roll=11, name=ketan, marks=789]
Delhi=StudentStream [roll=55, name=ravci, marks=529]
Odissa=StudentStream [roll=22, name=rohit, marks=326]
Pune=StudentStream [roll=44, name=Aman, marks=683]
Ranchi=StudentStream [roll=33, name=Keshri, marks=451]
------------------
Delhi=StudentStream [roll=55, name=ravci, marks=529]
Pune=StudentStream [roll=44, name=Aman, marks=683]
Bihar=StudentStream [roll=11, name=ketan, marks=789]
------------------
Bihar=StudentStream [roll=11, name=ketan, marks=789]
Delhi=StudentStream [roll=55, name=ravci, marks=529]
Odissa=StudentStream [roll=22, name=rohit, marks=326]
Ranchi=StudentStream [roll=33, name=Keshri, marks=451]
------------------
Bihar=StudentStream [roll=11, name=ketan, marks=789]
Delhi=StudentStream [roll=55, name=ravci, marks=529]
------------------
Delhi=StudentStream [roll=55, name=ravci, marks=529]
Pune=StudentStream [roll=44, name=Aman, marks=683]
Bihar=StudentStream [roll=11, name=ketan, marks=789]
 */



