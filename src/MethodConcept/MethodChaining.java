package MethodConcept;

public class MethodChaining {
	
	String name;
	static int wheels =4;
	
	public void m1() {//this is called method chaining
		System.out.println("m1 method");
		m2();
	}
	
    public void m2() {
    	System.out.println("m2 method");
    	m3();
	}
    
    public void m3() {
    	System.out.println("m3 method");	
	}
    
    //static method overloading
	public static void t1() {//this is called method chaining
		System.out.println("t1 method");
		t2();
	}
	
    public static void t2() {
    	System.out.println("t2 method");
    	t3();
	}
    
    public static void t3() {
    	System.out.println("t3 method");	
	}
	



}
