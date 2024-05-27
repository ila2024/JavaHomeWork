package hw8Abstraction;

public class ColumbiaUniversity {

	// Abstract method (Not possible in a regular class)
	// Explanation: Regular classes cannot have abstract methods
	// abstract void chemistry();

	// Non-abstract method
	void biology() {
		System.out.println("Studying biology at Columbia University");
	}

	// Constructor
	public ColumbiaUniversity() {
		// Default constructor
		System.out.println("Constructing ColumbiaUniversity object");
	}
}

// Step 02
class NYUniversity {
	// Non-abstract method
	void anthropology() {
		System.out.println("Exploring anthropology at NY University");
	}
}

// Step 03
class RockefellerUniversity {
	// Non-abstract method
	void maths() {
		System.out.println("Solving math problems at Rockefeller University");
	}

}
