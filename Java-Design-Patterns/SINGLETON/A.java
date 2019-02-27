public class A {
	
	private String a;
	private String b;
	
	/**
	 * Constructor is private, so the only to get an instance is through the provided method
	 */
	private A(){}
	
	/**
	 * Instance variable must be private and can be final if instantiation is not lazy 
	 */
	private static final A instance = new A();
	public static A getInstance(){
		return instance;
	}
	
	/**
	 * Require methods accessing instance variables to be synchronized
	 */
	public synchronized String getA() { return a; }
	public synchronized String getB() { return b; }
	public synchronized void setA(String a) { this.a = a; }
	public synchronized void setB(String b) { this.b = b; }
}
