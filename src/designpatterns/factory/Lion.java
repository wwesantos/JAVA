package designpatterns.factory;

public class Lion implements Animal{

	/**
	 * Constructor with package access only
	 * Only classes in the same package can instantiate it, like the AnimalFactory
	 */
	Lion(){}
	
	@Override
	public void move() {
		System.out.println("Lion running...");	
	}
}
