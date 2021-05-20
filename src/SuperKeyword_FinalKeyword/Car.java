package SuperKeyword_FinalKeyword;

public class Car {
	
	int speed = 120;
	
	public Car () {
		System.out.println("Car----Constructor");
	}
		
	public Car (int a) {
		System.out.println("Car----Constructor " + a);
	}
	
	public void start() {
		System.out.println("Car---Start");
	}	
	
	public void display() {
		System.out.println("Car----displayMethod");
	}

}
