package designpatterns.builder;

public class A {
	private String a;
	private String b;
	private int i;
	
	/**
	 * Constructor is private, so the only way to instantiate the class is through the Builder
	 */
	private A(String a, String b, int i) {
		super();
		this.a = a;
		this.b = b;
		this.i = i;
	}

	public String getA() { return a; }
	public String getB() { return b; }
	public int getI() { return i; }
	public void setA(String a) { this.a = a; }
	public void setB(String b) { this.b = b; }
	public void setI(int i) { this.i = i;}

	@Override
	public String toString() {
		return "A [a=" + a + ", b=" + b + ", i=" + i + "]";
	}
	
	/**
	 * Nested static Builder class 
	 * Can be instantiated without a prior an instance of the class to be built
	 */
	static class Builder{
		/**
		 * Contains same fields as class to be built
		 */
		private String a;
		private String b;
		private int i;
		
		
		/**
		 * Builder contain setters only
		 * Return instance of Builder to allow method chaining  
		 */
		public Builder setA(String a) { 
			this.a = a;
			return this;
		}
		public Builder setB(String b) { 
			this.b = b;
			return this;
		}
		public Builder setI(int i) { 
			this.i = i;
			return this;
		}
		
		/** 
		 * To be the last call on construction chaining, it will build the target instance  
		 */
		public A build(){
			return new A(a,b,i);
		}
	}
	
}
