package OOP_Encapsulation;

public class Login {
	
	private String userName;
	private String password;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void dologin(String un,String pwd) {
		System.out.println("login with "+un +  " "+ pwd);
		
	}
	

}
