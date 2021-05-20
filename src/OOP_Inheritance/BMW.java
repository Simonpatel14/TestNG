package OOP_Inheritance;

public class BMW extends Car{//we don't need to defined car methods again in bmw 
	//multiple inheritance is not allowed in Java
	
	//Method overloading:poly+Morphism : (Dynamic)Poly+Morphism : runtime polymorphism
	//when you have a method in parent class and the same ,method in child class
	//with the same name
	//same number of parameters
	//with same types
	//runtime Binding//dynamic binding
	
	String name = "My BMW Car";
	
//	@Override
//	public void start() {
//		 System.out.println("BMW-----start");
//	
//	}
	
	@Override
	public void engine() {
		System.out.println("BMW ------engine");
	}
	
	 public void autoParking() {
		 System.out.println("BMW-----autoParking");
	}
	//this is not overridden method to check use @Override
	 //static method can not be overridden
	 public static void autoPilot() {
			System.out.println("BMW-----autopilot");
		} 

}
