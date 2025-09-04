package zoo_management_system;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

	List<Animal> animals;
	
	
	public Zoo() {
		animals = new ArrayList<>();
	}
	
	void addAnimal(Animal a) {
		animals.add(a);
	}
	
	
	void makeAllSounds() {
		for (Animal a : animals) {
			a.makeSound();
			System.out.println("\n");
		}
	}
	
	void feedAllAnimals() {
		for(Animal a : animals) {
			a.feed();
		}
	}
}
