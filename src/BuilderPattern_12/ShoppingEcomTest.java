package BuilderPattern_12;

public class ShoppingEcomTest {

	public static void main(String[] args) {
		
		EcommApp ec = new EcommApp();
		ec.dologin("Sejal", "sejal123")//return this means it line is becoming object of this class
		    .search("Macbook")
		     .addToCart("Macbook")
		      .checkOut("Macbook")
		       .doPayment("1222 32323 4545 7877", "2315")
		        .getOrderDetails("Macbook")
		         .logOut();
		 
		EcommApp ec1 = new EcommApp();
		ec1.dologin("Sejal", "1245sejal")
		    .getOrderDetails("Nike shoes")
		      .logOut();
	
      
	    EcommApp ec2 = new EcommApp();
	    ec2.dologin("Tom", "tom245")
	        .logOut();
	    
	     
	}	
}

