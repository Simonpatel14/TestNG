package BuilderPattern_12;

public class EcommApp {
	
	public EcommApp dologin(String un, String pwd) {
		System.out.println("login with " + un +" "+ pwd);
		return this;
	}
	
	public EcommApp search(String productName) {
		System.out.println("searching with " + productName);
		return this;
	}
	
	public EcommApp search(String productName, String color) {
		System.out.println("searching with " + productName +" "+ color);
		return this;
	}


	public EcommApp addToCart(String productName) {
		System.out.println("adding to cart "+ " "+ productName);
		return this;
	}

	public EcommApp checkOut(String productName) {
		System.out.println("checkout : "+ " "+ productName);
		return this;
	}
	
	public EcommApp doPayment(String cc,String pwd) {
		System.out.println("payment done with : "+ cc + " "+ pwd);
		return this;
	}
	
	
	public EcommApp getOrderDetails(String productName) {
		System.out.println("get order details for  "+ productName);
		return this;
	}
	
	public EcommApp logOut() {
		System.out.println("Sucessfully logged out.....");
		return this;
	}
}
