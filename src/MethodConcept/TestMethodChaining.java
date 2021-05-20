package MethodConcept;

public class TestMethodChaining {
	
	public static void main(String[] args) {
		MethodChaining obj = new MethodChaining();
		obj.m1();
		MethodChaining.t1();
		
		//same rule apply for variables also
		obj.name = "Valkswagan";
		System.out.println(MethodChaining.wheels);
		
		
		

	}

}
