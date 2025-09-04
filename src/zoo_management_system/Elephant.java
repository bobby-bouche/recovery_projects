package zoo_management_system;

public class Elephant extends Animal{
	
	public Elephant(String name, int age) {
		super(name, age);
	}
	
	@Override
	void makeSound() {
		System.out.println("Brrrrr! said the elephant.");
	}
	
	void waveTrumpet() {
		System.out.println("waaavee!");
	}

	
	@Override
	public void feed() {
		System.out.println("Elephant is being fed..");
	}
}
