package zoo_management_system;

public abstract class Animal implements Feedable {

	// Animal fields
	String name;
	int age;
	
	
	// constructor
	Animal(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	
	abstract void makeSound();
	
	
	void getInfo() {
		System.out.println(name + " " + age);
	}
	
}
