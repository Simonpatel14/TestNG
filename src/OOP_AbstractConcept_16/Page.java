package OOP_AbstractConcept_16;

public abstract class Page {
	//can n't create the object of the abstract class
	//but can create the constructor of abstract class
	//it will be called when you create the the object of child class
	
	
	//Abstract class can have both abstract and non abstract methods
	// only abstract method-->yes -->100% abstraction
	//only non Abstract method -->0% abstraction
	//both abstract & non Abstract method -->yes --> partial abstraction
     static int i = 10;
	
	public Page () {
		System.out.println("Page---Constructor");
	}
	
	public abstract void header();
	public abstract void title();
	
	
	public void pageloading() {
		System.out.println("Page loading ---30s");
		add();
		
	}

	public static void url() {
		System.out.println("App page ---url");
		
	}
	public static void logo() {
		System.out.println("Page ---- logo ");
		
		
	}
	
	private void add() {
		System.out.println("----add----");
	}
	
	
	
	

}
