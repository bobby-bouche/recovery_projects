package zoo_management_system;

public class Parrot extends Animal {

	public Parrot(String name, int age) {
		super(name, age);
	}
	
	@Override
	void makeSound() {
		System.out.println("Ehhhhh..helloo! said the parrot.");
	}
	
	void talk() {
		System.out.println("Hows the weather?");
	}
	
	@Override
	public void feed() {
		System.out.println("Parrot is being fed..");
	}
	
}
