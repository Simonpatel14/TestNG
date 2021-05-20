package OOP_Inheritance;

public class TestCar {
	
	public static void main(String []args) {
	
	BMW b = new BMW();
	// b.start();//overridden
	//after declaring final keyword in car class against start method it can't overridden directly called from parent class 
	 b.stop();//inherited
	 b.autoParking();//inherited
	 b.autoParking();//independent
	 b.engine();//grandparent
	 BMW.autoPilot();
	 System.out.println(b.name);
	 
	 Audi a = new Audi();
	 a.start();
	 a.stop();
	 a.theftSafty();
	 a.refuel();
	 a.engine();
	 
	 
	 
	 Car c = new Car();
	 c.start();
	 c.stop();
	 c.refuel();//parent cann't access child class property
	 c.engine();//grandparent
	 Car.autoPilot();
	 
	 //Top/Up casting
	 Car c1=new BMW();
	 c1.start();
	 c1.stop();
	 c1.refuel();
	 
	 Vehical v = new BMW();
	 v.engine();
	 
	 //Down casting: mean create object of parent class which is refereed by child class
	 //BMW b1 = (BMW) new Car();
	 
//	 
//	  BMW B2 = (BMW) new Vehical();
//	 //at the compile time is allowed but run time it gives us class castException
//	 //eg. big boxes put it in small box(compile time) but can we use it (run time)
//	 
	 
	 
	

	}
	


}
