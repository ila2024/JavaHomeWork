package hw5JavaMethods;

public class FullName {

	// Method to print family member's full name
	public String FullName(String fName, String lName) {
		// Print the family member's full name
		System.out.println("Family Member: " + fName + " " + lName);
		// Return the full name
		return fName + " " + lName;
	}

	public static void main(String[] args) {
		FullName name = new FullName();

		System.out.println("Family Members:" + name.FullName("ILA", "Retu") + name.FullName("Waiz", "Wateen")
				+ name.FullName("Wad", "Mithu"));

	}

}
