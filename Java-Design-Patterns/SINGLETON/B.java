public class B {
	
	private String a;
	private String b;
	
	/**
	 * Constructor is private, so the only to get an instance is through the provided method
	 */
	private B(){}
	
	/**
	 * Instance variable must be private 
	 * Canon be final with lazy instantiation 
	 */
	private static B instance;
	public static B getInstance(){
		if(instance == null){
			synchronized(B.class){ 
				//Double-Check Locking
				if(instance == null){
					instance = new B();
				}
			}
		}
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
