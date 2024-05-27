package hw7Inheritance;

public class AnimalTest {
	
	public static void main(String[] args) {
		
	Animal animal = new Animal();
    Mammal mammal = new Mammal();
    Reptile reptile = new Reptile();
    Birds bird = new Birds();
    Dog dog = new Dog();
    Snake snake = new Snake();
    Robin robin = new Robin();
    BullDog bullDog = new BullDog();
    Cobra cobra = new Cobra();
    
    animal.animalInfo();
    mammal.mammalInfo();
    reptile.reptileInfo();
    bird.birdsInfo();
    dog.dogInfo();
    snake.snakeInfo();
    robin.robinInfo();
    bullDog.bullDogInfo();
    cobra.cobraInfo();
    
    //Demonstrating inheritance hierarchy
    // Single Inheritance: BullDog extends Dog
    // Multilevel Inheritance: BullDog extends Dog and Dog extends Mammal
    // Hierarchical Inheritance: Cobra extends Snake and Robin extends Birds
    bullDog.dogInfo(); // From Dog Class
    bullDog.mammalInfo(); // From Mammal Class
    bullDog.animalInfo(); // From Animal Class

    cobra.snakeInfo(); // From Snake Class
    cobra.reptileInfo(); // From Reptile Class
    cobra.animalInfo(); // From Animal Class

    robin.birdsInfo(); // From Birds Class
    robin.animalInfo(); // From Animal Clas
   
	}
}