package zoo_management_system;

public class Driver {
	

	public static void main(String[] args) {
		
		try {
			
			Zoo zoo = new Zoo();
			Lion lion = new Lion("Harry", 4, 10);
			Parrot parrot = new Parrot("Polly", 2);
			Elephant elephant = new Elephant("Elaneor", 8);
			
			zoo.addAnimal(lion);
			zoo.addAnimal(elephant);
			zoo.addAnimal(parrot);
			
			zoo.makeAllSounds();
			
			
		}
		catch(IllegalArgumentException e) {
			System.out.println(e);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
