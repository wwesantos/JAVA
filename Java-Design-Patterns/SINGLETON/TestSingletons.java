public class TestSingletons {
	public static void main(String[] args) {
		
		A a1 = A.getInstance();
		A a2 = A.getInstance();
		System.out.println("a1==a2 -> "+ (a1 == a2));
		
		B b1 = B.getInstance();
		B b2 = B.getInstance();
		System.out.println("b1==b2 -> "+ (b1 == b2));
		
		E e1 = E.INSTANCE; //enum based
		E e2 = E.INSTANCE;
		System.out.println("e1==e2 -> "+ (e1 == e2));
		
		//Examples of calling methods on a singleton
		A.getInstance().getB();
		B.getInstance().getA();
		E.INSTANCE.getB();
		a1.getA();
		b1.getB();
		e1.getA();
	}
}
