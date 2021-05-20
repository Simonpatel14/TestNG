package MethodConcept;

public class MainMethodOverLoadingConcept {
	//Main Method overloading is possible

	public static void main(String[] args) {
		System.out.println("This is my main Method........");
      main("not main method");
      main(10,20);
	}
    public static void main(String method) {
    	System.out.println("This is main " + method);

	}
    public static void main(int a, int b) {
    	System.out.println("This is main " + a+ b);

	}
}
