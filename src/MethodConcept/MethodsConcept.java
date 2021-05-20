package MethodConcept;

public class MethodsConcept {
	//Methods is simple programme which can be reusable again & again
	//can't create function inside function
	//can't create inside main function 
	
	
	//1.no Input(Parameter) and no return
	// Void= can't return anything  
	public void test() {
		System.out.println("----Test Method-------");
	}
		
		
	//2. no input but some return:
	//name of the function: getNumber
	//return type of the function : int
	
	public int getNumber() {//return 
		int a1 = 10;
		int b1 = 20;
		int c1 = a1+b1+300;
		return c1;
		
	}	
	 
	public String getTrainerName() {
		System.out.println("get trainer name");
		String name = "sejal";
		return name;
		//function can't return multiple return. it should have one & only one return
	}
	
	//3. some inputs and some return:
	
	public int add(int a,int b) {
		System.out.println("add Method");
		int z = a+b;
		return z;
	}
	
	//WAF where you have to pass student name(String) and return marks(Integer)
	
	public int getStudentMarks(String studentName) {
		System.out.println("getting the marks for "  + studentName);
		
		if (studentName.equals("Tom")) {
			return 90;
			}
		else if(studentName.equals("Paige")) {
			return 80;
		}
		else if(studentName.equals("Walter")) {
			return 50;
		}
		else {
			System.out.println(studentName + " is not Present.....");
			return -1;  
		}
	
	}
	//other way to write programme : compare return
	public int getMyStudentMarks(String studentName) {
		System.out.println("getting the marks for "  + studentName);
		int marks = -1;
		
		if (studentName.equals("Tom")) {
			marks = 90;
			}
		else if(studentName.equals("Paige")) {
			marks = 80;
		}
		else if(studentName.equals("Walter")) {
			marks = 50;
		}
		else {
			System.out.println(studentName + " is not Present....."); 
		}
        return marks;
	}
	// WAF where have to pass browser name(String) and return boolean
	public boolean launchBrowser(String browser) {
		System.out.println("launching browser " + browser);
		
		boolean flag = false;
		
		if(browser.equals("Chrome")){
			System.out.println(browser + " is launched");
			flag = true;
		}
		else if(browser.equals("Safari")){
			System.out.println(browser  + " is launched");
			flag = true;
		}
		else if(browser.equals("Opera")){
			System.out.println(browser + " is launched");
			flag = true;
		}
		else if(browser.equals("Firefox")){
			System.out.println(browser  + " is launched");
			flag = true;
		}
		else{
			System.out.println(browser  + " is  not launched  Please pass correct browsername.. ");
		}
		return flag;
	}
    
	//Can i return multiple values from a Function ? = No
	//WAF where it will take emp name(String) & return emp information(Object)
	//info : name,age,city,ph,co name
	
	public Object [] getEmpInfo(String empName) {
		System.out.println("EMP Name is " + empName);
		
		Object empInfo [] = new Object [5];
		
		
		if(empName.equals("Sejal")) {
			empInfo [0] = "Sejal";
			empInfo [1] = 30;
			empInfo [2] = "Pune";
			empInfo [3] = 054506;
			empInfo [4] = "IBM";
			
			for (Object e :empInfo) {
				System.out.println(e);
			}
		    }
		
			else if(empName.equals("Shweta")) {
				empInfo [0] = "Shweta";
				empInfo [1] = 30;
				empInfo [2] = "NewYork";
				empInfo [3] = 567890;
				empInfo [4] = "Cetara";
				
				for (Object e :empInfo) {
					System.out.println(e);
			}
			}
			else	{
				System.out.println(empName + " is not found in the companylist");
			}
		   return empInfo;
			
		}
	
	
	public static void main(String[] args) {
		//to call all the class methods,we have to create the object of the class
		
	     int a = 10;
	     int b = 20;
	     int c = a+b+500;
	     System.out.println(c);//this cod can't reusable bz this  are hard coded value

	    //object must be create with using class name, object ref = new(keyword)again class name 
	     MethodsConcept obj = new MethodsConcept();//object is RHS anf object ref = obj
	     obj.test();
	     
	     int sum = obj.getNumber();
	     System.out.println(sum-100);
	     
	     System.out.println(obj.getNumber());
	     
	     String m = obj.getTrainerName();
	     System.out.println(m);
	     
	     int m1 = obj.add(20, 30);
	     System.out.println(m1);
	     
	     m1 = obj.add(60, 50);
	     System.out.println(m1);
	     
	     int s = obj.getStudentMarks("Paige");
	     System.out.println(s);
	     
	     s = obj.getStudentMarks("Sejal");
	     System.out.println(s);
	     
	    int m3 =  obj.getMyStudentMarks("Walter");
	    System.out.println(m3);
	    
	    boolean b1 = obj.launchBrowser("IE");
	    System.out.println(b1);
	    
	    b1 = obj.launchBrowser("Chrome");
	    System.out.println(b1);
	    
	    Object sejalInfo [] = obj.getEmpInfo("Shweta");	
	    System.out.println(sejalInfo.length);		
	
	     
	     
	}

}
