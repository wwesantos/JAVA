public class TestAnimalFactory {
	public static void main(String[] args) {
		
		Animal animal = null;
		
		animal = AnimalFactory.getAnimal("fly");
		animal.move();
		
		animal = AnimalFactory.getAnimal("run");
		animal.move();
		
		animal = AnimalFactory.getAnimal("swim");
		animal.move();
	}
}
