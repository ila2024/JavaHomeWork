package hw5JavaMethods;

public class MyFamily {

	// Declare int type variables
	int child1Age = 5;
	int child2Age = 7;
	int child3Age = 9;
	int child4Age = 11;

	// Method to calculate and return the sum of children's ages
	public int MyFamily() {
		return child1Age + child2Age + child3Age + child4Age;
	}

	public static void main(String[] args) {
		MyFamily family = new MyFamily();
		family.MyFamily();
		System.out.println("The sum of my childrens age is: " + family.MyFamily());
		

	}
}
