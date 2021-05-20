package OOP_Inheritance;

public  class Car extends Vehical{//when we declare final keyword then class can't be parent
	//final keyword prevent inheritance
	
	String name = "My car";
	
	public  final void start() {
		System.out.println("Car----start");
	}
	
	public void stop() {
		System.out.println("Car----stop");
	}
	
	public  void refuel() {// method declare with final keyword can't be overridden
		System.out.println("Car----refuel");
	}
	public final  void refuel(int a) {// method overloading is possible with final keyword
		System.out.println("Car----refuel");
	}
	
	public static void autoPilot() {
		System.out.println("Car-----autopilot");
	}
	

}
