package hw3JavaVariablesInitialized.copy;

public class AboutMeTest {

	public static void main(String[] args) {

		AboutMe obj = new AboutMe();
		obj.name = "ILA";
		obj.age = 25;
		obj.gender = 'F';
		obj.student = true; 
		obj.myByte = 120;
		obj.myShort = 30000;
		obj.myLong = 1234567890123L;
		obj.myDouble = 3.14;

		obj.diplayInformation();

		AboutMe obj2 = new AboutMe();
		obj2.name = "Robin";
		obj2.age = 30;
		obj2.gender = 'M';
		obj2.student = false; 
		obj2.myByte = 100;
		obj2.myShort = 25000;
		obj2.myLong = 9876543210987L;
		obj2.myDouble = 2.71;

		obj2.diplayInformation();

	}

}
