package constructor_11And12;

public class AmazonLogin {//this is template class
	String userName;
	String password;
	String role;
	
	//seller : vendor,seller,partner below constructor will use
	public AmazonLogin(String userName, String password, String role) {
		this.userName = userName;
		this.password = password;
		this.role = role;
	
	}
	//customer we can't use above constructor

	public AmazonLogin(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}
	
//	public AmazonLogin() {
//		
//	}
	
    public AmazonLogin(String userName) {
    	this.userName = userName;
		
	}
    //feature/method or function
    
    public void dologin(String userName,String password) {
    	System.out.println("login with  "+ userName + " "+ password);
    }
    
    public void dologin(String userName,String password,String role) {
    	System.out.println("login with  "+ userName + " "+ password+ " "+ role);
    }
	
    public void forgotPwd(String userName) {
    	System.out.println("forgot password with " + userName);
    }

    public void signUpPwd() {
    	
    }

    
}
