package constrMethodChainAssign;

public class BankApp {
	
	public BankApp launchBrowser(String bankName) {
		System.out.println("User on web page of " + bankName);
		return this;
	}
	public BankApp savingLogin(String userName,String pwd,int otp) {
		System.out.println("Savingaccount Login with : " + userName +" " + pwd + " " + otp);
		return this;
	}
	public BankApp businessLogin(String userName,String pwd,int otp,String memorableInfo) {
		System.out.println("Businessaccount Login with : " + userName +" " + pwd + " " + otp +" "+ memorableInfo);
		return this;
	}
	public BankApp search(String bankProductName) {
		System.out.println("Searching for : " + bankProductName );
		return this;
	}
	
	public BankApp viewStatement(String fromDt,String toDt) {
		System.out.println("View St : " + fromDt +" " + toDt );
		return this;
	}
	public BankApp viewStatement(String entreMonth , int year) {
		System.out.println("View St : " + entreMonth +" " + year);
		return this;
	}
	public BankApp addPayee(String accHolderName, int accNum,int sortCode) {
		System.out.println("Add Payee by : " + accHolderName +" " + accNum + " " + sortCode );
		return this;
	}
	public BankApp deletePayee(String delete) {
		System.out.println("Delete Payee  : " + delete);
		return this;
	}
	public BankApp tfrPaymt(int accNum,int sortCode,String accHolderName) {
		System.out.println("Make a Payment with : " + accNum + " " + sortCode + " " + accHolderName );
		return this;
	}
	public BankApp logOut() {
		System.out.println("Thank you for visiting us....");
		System.out.println("successfully logged out from your account.....");
		return this;
	}
	
	

}
