public class TestABuilder {
	public static void main(String[] args) {
		
		A a = new A.Builder()
				.build();
		System.out.println(a.toString());
		
		a = new A.Builder()
				.setA("A")
				.build();
		System.out.println(a.toString());
		
		
		//Methods can be called in any order
		a = new A.Builder()
				.setB("B")
				.setI(10)
				.setA("A")
				.build();
		System.out.println(a.toString());
	}
}
