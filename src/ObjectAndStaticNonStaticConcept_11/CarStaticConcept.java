package ObjectAndStaticNonStaticConcept_11;

public class CarStaticConcept {
	
	String name;
	int price;
	String color;
	static int wheels = 4;
	
	public static void start() {
	       System.out.println("car---start");
	}
	
	public static void start(String key) {//overloaded method overriding is not possible in static
	       System.out.println("car---start");
	}
	
	public void stop() {
		   System.out.println("car---stop");
			
	}
	
	public void steering() {
		   System.out.println("car---steering");
			
		}
	public void login() {
		
	}
	
    public void login(int a) {
		
	}
	
	public static void main(String[] args) {
		
		/*how to call static variables/Methods in the class
		   no need to create objects of the class
		   1. can be called directly within the same class*/
             System.out.println(wheels);
             start();
		
		  // 2.should be called by className
             System.out.println(CarStaticConcept.wheels);
             CarStaticConcept.start();
             
          // for name static variables/Method
          // have to create the object   
		CarStaticConcept c1 = new CarStaticConcept();
		c1.name = "BMW";
		c1.price = 70;
		c1.color = "Beige";
		//c1.wheels = 4;//this is common value for all object so its better to make it static 
		start();
		c1.steering();
		c1.stop();
	
		CarStaticConcept c = new CarStaticConcept();
		c.name = "Mercedes-Benz";
		c.price = 70;
		c.color = "Beige";
		//c.wheels = 4;//warning because we made static
		//CarStaticConcept.wheels;
		start();
		c.steering();
		c.stop();
	}

}
