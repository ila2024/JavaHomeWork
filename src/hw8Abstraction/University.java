package hw8Abstraction;

public interface University {
	// Declaring methods in the interface
	void classSize();

	void playGround();

	void teacher();

	// Constructor (Not possible in an interface)
	// Explanation: Interfaces cannot have constructors
	// public University() {}
}

// Step 02
interface Hospital {
	// Declaring methods in the interface
	void emergencyRoom();

	void surgeryRoom();

	void cafeteria();
}

// Step 03
interface College {
	// Declaring methods in the interface
	void commonRoom();

	void laboratory();

	void languageClub();
}

// Step 04
interface VocationalSchool {
	// Declaring a method in the interface
	void vocationalInfo();
}

// Step 05
interface AeronauticalSchool {
	// Declaring a method in the interface
	void aeronauticalInfo();
}

// Step 06
interface LawSchool {
	// Declaring a method in the interface
	void lawInfo();

}
