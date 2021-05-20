package SuperKeyword_FinalKeyword;

public class BMW extends Car{
	
	int speed = 150;
	String name;
	
	public BMW () {
		super(10);
		System.out.println("BMW----Constructor");
	}
	public BMW (String name) {
		super(10);
		this.name = name;
		System.out.println("BMW----Constructor");
	}
	
	public void checkSpeed() {
		System.out.println(speed);
		System.out.println(super.speed);
		
	}
	
	public void display() {
		System.out.println("BMW----displayMethod");
		super.display();
		
	}
	
	
	

}
