package zoo_management_system;

public class Lion extends Animal {

	Lion(String name, int age) {
		super(name, age);
	}

	
	@Override
	void makeSound() {
		System.out.println("Roarrr! said the lion.");
	}

	
	void displayMainLength() {
		System.out.println();
	}


	@Override
	public void feed() {
		System.out.println("Lion is being fed..");
	}
	
	
}
