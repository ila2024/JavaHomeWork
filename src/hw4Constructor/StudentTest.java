package hw4Constructor;

public class StudentTest {

	public static void main(String[] args) {
		
		// Step 5: Create objects and initialize constructors
        Student student1 = new Student("ILA", 12345, 'f', true, 85.5f);
        Student student2 = new Student("Retu", 54321, 'f', false, 75.0f);
        
        
     // Step 7: Print the expected outcome
        System.out.println("Student Name: " + student1.name + ", ID: " + student1.ID + ", Gender: " + student1.gender + ", Grade: " + student1.grade + 
        		" and Java Programmer? Ans: " + student1.programmer);  
        
        System.out.println("\nStudent Name: " + student2.name + ", ID: " + student2.ID + ", Gender: " + student2.gender + ", Grade: " + student2.grade + 
        		" and Java Programmer? Ans: " + student2.programmer);  

	}

}
