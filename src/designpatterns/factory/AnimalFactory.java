package designpatterns.factory;

public class AnimalFactory {
	public static Animal getAnimal(String moveType){
		
		/**
		 * Precise type is decided in runtime 
		 */
		switch(moveType){
			case "swim": return new Shark();
			case "run": return new Lion();
			case "fly": return new Eagle();
		}
		throw new UnsupportedOperationException("Unsupported type of animal "+moveType);
	}
}
