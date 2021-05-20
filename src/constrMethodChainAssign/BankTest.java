package constrMethodChainAssign;

public class BankTest {

	public static void main(String[] args) {
		BankApp customer = new BankApp();
		System.out.println("----------------------------------------");
		customer.launchBrowser("NatwestBank")
		          .savingLogin("Lucy", "12lucy", 125869)
		           .search("CreditCard")
		            .addPayee("Lisa", 57848889, 001203)
		             .tfrPaymt(12355687, 777777, "Paige")
		              .viewStatement("December", 2020)
		               .viewStatement("01/11/2020", "31/01/2021")
		                .deletePayee("Edward")
		                 .search("Insurance")
		                  .logOut();
		System.out.println("-------------------------------------------");
		
		customer.launchBrowser("HSBCBank")
		         .businessLogin("Lucy", "car123", 895467, "Taj")
		          .viewStatement("15/01/2021","15/02/2021")
		           .logOut();
		
		System.out.println("-------------------------------------------");
		
		BankApp customer1 = new BankApp();
		customer1.launchBrowser("LloydsBank")
		          .businessLogin("Bharat", "85admin", 45867, "Mumbai")
		            .tfrPaymt(56485294, 989898, "Andrew")
		              .viewStatement("November", 2020)
		                .search("Insurance")
		                  .logOut();
		
		System.out.println("-------------------------------------------");
		
		BankApp customer2 = new BankApp();              
		customer2.launchBrowser("LloydsBank")
        .savingLogin("Andy", "Hull", 264589)
          .addPayee("Aakash", 89578595, 223344)
           .tfrPaymt(85647958, 559988, "Brian")
            .viewStatement("October", 2020)
               .search("Home Mortgage")
                .logOut();
		
		
	

	}

}
