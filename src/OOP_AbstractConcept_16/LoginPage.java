package OOP_AbstractConcept_16;

public class LoginPage extends Page {
	 
	
	
	
	public LoginPage () {
		System.out.println("LP---Constructor");
	}

	@Override
	public void header() {
	 System.out.println("LP - header");
		
	}

	@Override
	public void title() {
		System.out.println("LP - title");
	}
	
	@Override
	public void pageloading() {
		System.out.println("LP pageloading ---10s");
		
	}
	
	public void doLogin(String un, String pwd) {
		System.out.println("login with : " + un +" : " + pwd);
	}
	
	 
}
