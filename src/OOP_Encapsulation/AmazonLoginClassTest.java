package OOP_Encapsulation;

public class AmazonLoginClassTest {
	public static void main (String [] args) {
		
		System.out.println("---------admin----------");
		Login lp = new Login();
		lp.setUserName("admin123@gmail.com");
		lp.setPassword("admin123");
		
		lp.dologin(lp.getUserName(), lp.getPassword());
		
		System.out.println(lp.getUserName());
		
		lp.setPassword("admin456");
		lp.dologin(lp.getUserName(), lp.getPassword());
		
		System.out.println("---seller---------");
		
		Login lp1 = new Login();
		lp1.setUserName("seller123@gmail.com");
		lp1.setPassword("seller123");
		
		lp1.dologin(lp1.getUserName(), lp1.getPassword());
		
		System.out.println(lp1.getUserName());
		
		lp.setPassword("seller456");
		lp.dologin(lp1.getUserName(), lp1.getPassword());
		
		
		HomePage hp = new HomePage();
		hp.enterUserName("admin13@gmail.com");
		hp.enterPassword("admin1232");
		hp.clickLoginButton();
		
		
	}

}
