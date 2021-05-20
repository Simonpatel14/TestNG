package constructor_11And12;

public class AmazonTest {

	public static void main(String[] args) {
		
		//seller user:
		AmazonLogin az = new AmazonLogin("Seller","seller123","sellerRole");
		System.out.println(az.userName);
		System.out.println(az.userName+" "+az.password +" "+az.role);
		
		az.dologin(az.userName, az.password, az.role);
		az.forgotPwd(az.userName);
		
		//customer having different device or diff username and password
		AmazonLogin az1 = new AmazonLogin("naveen", "naveen123");
		
		az1.dologin(az1.userName, az1.password);
		az1.forgotPwd(az1.userName);
		
		
		
		
		
		
	}

}
