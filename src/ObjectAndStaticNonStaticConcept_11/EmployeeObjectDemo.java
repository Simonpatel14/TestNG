package ObjectAndStaticNonStaticConcept_11;

public class EmployeeObjectDemo {
 
		//Class is Category and objects will be created from that particular templetes
		//class Variables: this are class variable created under class and not under main method
		
		String name;
		int age;
		String dob;
		double salary;
		boolean isPermanent;
		
		public static void main(String[] args) {
			
			//Create an Object of the class
			
			
			//Employee =Class name ,e1 = reference name , new = keyword to create object(RHS)
			//object stored in Heap memory(new Employee) and ref name stored in Stack memory(e1)
			EmployeeObjectDemo e1 = new EmployeeObjectDemo();
		     e1.name="Tom";
		     e1.age = 25;
		     e1.dob = "01/01/1986";
		     e1.salary = 23.55;
		     e1.isPermanent = true;
		     
			
		 	EmployeeObjectDemo e2 = new EmployeeObjectDemo();
		     e2.name="Paige";
		     e2.age = 30;
		     e2.dob = "01/05/1988";
		     e2.salary = 25.33;
		     e2.isPermanent = false;
		     
		 	EmployeeObjectDemo e3 = new EmployeeObjectDemo();
		     e3.name="Walter";
		     e3.age = 40;
		  
		     
		     System.out.println(e1.name + " "+ e1.age +" " +e1.dob +" " +e1.salary+" " +e1.isPermanent);
		     System.out.println(e2.name + " "+ e2.age +" " +e2.dob +" " +e2.salary+" " +e2.isPermanent);
		     System.out.println(e3.name + " "+ e3.age +" " +e3.dob +" " +e3.salary+" " +e3.isPermanent);
				
		     System.out.println("------------------------------------");
		     e1 = e2;
		     System.out.println(e1.name + " "+ e1.age +" " +e1.dob +" " +e1.salary+" " +e1.isPermanent);//Paige
		     System.out.println(e2.name + " "+ e2.age +" " +e2.dob +" " +e2.salary+" " +e2.isPermanent);//paige
		     System.out.println(e3.name + " "+ e3.age +" " +e3.dob +" " +e3.salary+" " +e3.isPermanent);//Walter
			
		     System.out.println("------------------------------------");
              e2 = e3;
             System.out.println(e1.name + " "+ e1.age +" " +e1.dob +" " +e1.salary+" " +e1.isPermanent);//Paige
 		     System.out.println(e2.name + " "+ e2.age +" " +e2.dob +" " +e2.salary+" " +e2.isPermanent);//Walter
 		     System.out.println(e3.name + " "+ e3.age +" " +e3.dob +" " +e3.salary+" " +e3.isPermanent);//Walter
 		    

		     System.out.println("------------------------------------");
              e3 = e1;
             System.out.println(e1.name + " "+ e1.age +" " +e1.dob +" " +e1.salary+" " +e1.isPermanent);//Paige
 		     System.out.println(e2.name + " "+ e2.age +" " +e2.dob +" " +e2.salary+" " +e2.isPermanent);//Walter
 		     System.out.println(e3.name + " "+ e3.age +" " +e3.dob +" " +e3.salary+" " +e3.isPermanent);//Paige
 		     
 		     //we can't say zero(0) reference but have to say no reference to that object
 		     
 		     
 		     
 			 
	}

}
