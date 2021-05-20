package MethodConcept;

public class MethodOverLoadingOrPolyMorphism {
	// Method OverLoading (Compile time Poly + Morphism) : within the same class,when we have different methods
	//with the same name
	//with different parameters
	//the sequence of the parameter is different
	//static binding
	public void login() {//0
		
	}
    public void login(int a) {//1
		
	}
    public int login(int a,int b) {//2
	   int c = a+b;
    	return c;
    }
    public boolean login(int c,String d) {//2
    	return true;
    }
    public void login(String d,int a) {//2
    	
    }
    
    //login overloading
    
      public void doLogin() {
      System.out.println("default Login");    
      }
      
      public String doLogin(String un , String pwd) {
          System.out.println("Login with : " + un +" : " + pwd ); 
          return "Lofin Sucessful";
          }
      
      public boolean doLogin(String un , String pwd, String role) {
          System.out.println("Login With : " + un + ": " + pwd + " : " + role);
          return true;
          }
      
      public void doLogin(long phone, String pwd ) {
    	  System.out.println("Login With : " + phone + " : " + pwd);      
          }
      
      public void doLogin(long phone, int otp ) {
    	  System.out.println("Login With : " + phone + " : " + otp);
      }
      
      //ecommerce 
      public void search() {
    	  
      }
      public void search(String productName) {
    	  
      }
      public void search(String productName, int price) {
    	  
      }
      public void search(String productName, int price ,String Colour) {
    	  
      }
      //same e-commerce when we reach payment method
      public void doPayment(String cc, int pwd) {
    	  
      }
      public void doPayment(String cc, String pwd, int otp ) {
    	  
      }
      
      public void doPayment(String UPI) {
    	  
      }
      
      //booking car
      public void bookingCar(String from, String to) {
    	  
      }
      public void bookingCar(String from, String to, int person ) {
    	  
      }
      
      public void bookingCar(String from, String to, int personcount,String carType) {
    	  
      }
      
      
	public static void main(String[] args) {
		 MethodOverLoadingOrPolyMorphism  login= new  MethodOverLoadingOrPolyMorphism ();
		 int i =login.login(20,30);
		 System.out.println(i);
		 
		 login.doLogin();
		 login.doLogin(895652544, "admin123");
		 if (login.doLogin("Naveen", "admin122", "admin")) {
			 System.out.println("user Sucessfully login.....");
			 
		 }
		String mesg = login.doLogin("Sejal", "admin123");
		  System.out.println(mesg);
			 
			 
		 
		 
				
		
		
	
	}

}
