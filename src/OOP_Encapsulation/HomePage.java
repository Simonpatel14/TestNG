package OOP_Encapsulation;

public class HomePage {
	//locators
	private String email = "Username";
	private String pwd = "//input [@id = 'Value']";
	private String loginButton = "#loginbutton";
	
	//page Actions(Public):
	public void enterUserName(String userName) {
		System.out.println(email + "---> enter the user name : " + userName);
	}
	
	public void enterPassword(String password) {
		System.out.println(pwd + "---> enter the  password : " + password);
	}
	
	public void clickLoginButton () {
		System.out.println(loginButton + "---> click on Login Button");
	}
	
	
	
	

}
