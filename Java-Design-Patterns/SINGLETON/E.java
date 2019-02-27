/**
 * Enum version of a Singleton
 * Eliminates need to: 
 *   - static variable to store singleton reference
 *   - private constructor
 *   - synchronization on lazy instantiation
 */
public enum E {
	INSTANCE;
	
	private String a;
	private String b;
	public synchronized String getA() { return a; }
	public synchronized String getB() { return b; }
	public synchronized void setA(String a) { this.a = a; }
	public synchronized void setB(String b) { this.b = b; }
}
