package OOP_InterfaceConcept;

public interface USMedical extends WHO {
	//no method body
	//only Method declaration
	//only method prototype
	//no business logic
	//can't create the object of interface
	//can not create the constructor of interface
	//method can not be static bz they cannot be override in child class
	
	int min_fee = 10;
	
	public void orthoServices();
	
	public void neuroSrvices();
	
	public void emergencyServices();
	
	public void radioServices();
	
	//public int test (int a);
	
	//after 1.8jdk:
	//1. can have static method in Interface with body
	
	public  static void billing() {
		System.out.println("US - billing");
	}
    
	//2.can have default  method with method body
	default void taxCollection() {
		System.out.println("Us --30 % taxCollection");
	}
}
