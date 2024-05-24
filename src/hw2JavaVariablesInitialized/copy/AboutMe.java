package hw2JavaVariablesInitialized.copy;

public class AboutMe {

	// Step 1: Package declaration

	// Step 3: Declare a variable (String)
	String myName;
	// Step 4: Initialize variables of different types
	int myAge = 25;
	float myGPA = 3.8f;
	char initial = 'J';
	boolean isFullTimeStudent = true;

// Step 4: Constructor declaration
	public AboutMe() {
		System.out.println(": This is all about Myself :");
	}

// Step 6: Method implementation
	public void aboutMe() {
		// Step 7: Calling variables inside method
		System.out.println("Name: " + myName);
		System.out.println("Age: " + myAge);
		System.out.println("GPA: " + myGPA);
		System.out.println("Initial: " + initial);
		System.out.println("Full Time Student: " + isFullTimeStudent);
	}

// Main method
	public static void main(String[] args) {
		// Step 8: Instantiating AboutMe class and calling aboutMe method
		AboutMe myInfo = new AboutMe();
		myInfo.aboutMe();
	}

}
