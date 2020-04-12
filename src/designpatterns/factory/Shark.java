package designpatterns.factory;

public class Shark implements Animal{

	/**
	 * Constructor with package access only
	 * Only classes in the same package can instantiate it, like the AnimalFactory
	 */
	Shark(){}
	
	@Override
	public void move() {
		System.out.println("Sharks swimming...");
	}
}
