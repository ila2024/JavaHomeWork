package hw8Abstraction;

public abstract class MedicalSchool {
	// Abstract method
	abstract void anatomyLab();

	// Non-abstract method
	void biochemistryLab() {
		System.out.println("Performing experiments in Biochemistry Lab");
	}

	// Constructor
	public MedicalSchool() {
		// Default constructor
	}
}

//Step 03
abstract class EngineeringSchool {
	// Abstract method
	abstract void mechanicalLab();

	// Non-abstract method
	void computerLab() {
		System.out.println("Working on projects in Computer Lab");
	}
}

//Step 04
abstract class NursingSchool {
	// Abstract method
	abstract void hygiene();

	// Non-abstract method
	void caring() {
		System.out.println("Learning about patient care and empathy");
	}
}
