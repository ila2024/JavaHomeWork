package hw4Constructor;

public class Student {

	String name;
	int ID;
	char gender;
	boolean programmer;
	float grade;

	// Step 4: Declare a parameterized constructor
	public Student(String name, int ID, char gender, boolean programmer, float grade) {
		this.name = name;
		this.ID = ID;
		this.gender = gender;
		this.programmer = programmer;
		this.grade = grade;

		// Step 6: Print a meaningful outcome in the parameterized constructor
		System.out.println("This is all about Student.");

	}
}
