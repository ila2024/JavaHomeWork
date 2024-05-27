package hw7Inheritance;

public class Animal {
	// Step 02
	void animalInfo() {
		System.out.println("This method is from Animal Class");
	}
}

//Step 03
class Mammal extends Animal {
 void mammalInfo() {
     System.out.println("This method is from Mammal Class");
 }
}

//Step 04
class Reptile extends Animal {
 void reptileInfo() {
     System.out.println("This method is from Reptile Class");
 }
}

//Step 05
class Birds extends Animal {
 void birdsInfo() {
     System.out.println("This method is from Birds Class");
 }
}

//Step 06
class Dog extends Mammal {
 void dogInfo() {
     System.out.println("This method is from Dog Class");
 }
}

//Step 07
class Snake extends Reptile {
 void snakeInfo() {
     System.out.println("This method is from Snake Class");
 }
}

//Step 08
class Robin extends Birds {
 void robinInfo() {
     System.out.println("This method is from Robin Class");
 }
}

//Step 09
class BullDog extends Dog {
 void bullDogInfo() {
     System.out.println("This method is from BullDog Class");
 }
}

//Step 10
class Cobra extends Snake {
 void cobraInfo() {
     System.out.println("This method is from Cobra Class");
 }
}