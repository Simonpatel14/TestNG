package constructor_11And12;

public class CompanyConstruc {
	//lecture-12
	//Class variables or global variables
	String name;
	int empCount;
	String city;
	String address;
	String ceoName;
	static String category = "IT";
	
	//constructor overloading
	public CompanyConstruc() {
		System.out.println("defualt const...");
		
	}
	//name = name;this not correct st..bz we giving name to name only
    //use this keyword to solve problems
	public CompanyConstruc(String name,int empCount) {
		
		this.name = name; //this.name is represent class variable and =name is local variables
		this.empCount = empCount;
		//this.category = category;because static never participate for creating object.in const.. bz its not constant it is common value for all object.
		}
	
	public CompanyConstruc(String name, int empCount, String city) {
		this.name = name;
		this.empCount = empCount;
		this.city = city;
	}
	//below const..i soverloaded with allglobal variables
	public CompanyConstruc(String name, int empCount, String city, String address, String ceoName) {
		super();
		this.name = name;
		this.empCount = empCount;
		this.city = city;
		this.address = address;
		this.ceoName = ceoName;
	}
	
	
	//lecture = 11
	//Constructor of the class
	//name should remain as the class name but it is not a function.it look like function but it not a function
	//can not return anything, it means no return type even no void well bz it no return type
	//its not a function
	//constructor will help to create the objects with diff types of class variables
	//duplicate const..is not allowed 
	//can create the with method overloading
	//will be called when you create the object of the class..it will called automatically
	
//	
//	public CompanyConstruc() {
//		System.out.println("defualt const...");
//		
//	}
//	
//	public CompanyConstruc(int a) {
//		System.out.println("one param const..." + a);
//		
//	}
//	public CompanyConstruc (int a, int b) {
//		System.out.println("two param const..." + a+" "+ b);
//		
//	}
	
}
