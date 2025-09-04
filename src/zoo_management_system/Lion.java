package zoo_management_system;

public class Lion extends Animal {
	
	private double mainLength;

	
	
	
	Lion(String name, int age, double mainLength) {
		super(name, age);
		this.setMainLength(mainLength);
	}
	
	
	
	
	@Override
	void makeSound() {
		System.out.println("Roarrr! said the lion.");
	}

	
	
	
	void displayMainLength() {
		System.out.println("Main length: " + mainLength + " cm");
	}

	
	

	@Override
	public void feed() {
		System.out.println("Lion is being fed..");
	}




	public double getMainLength() {
		return mainLength;
	}




	public void setMainLength(double mainLength) {
		this.mainLength = mainLength;
	}
	
	
}
