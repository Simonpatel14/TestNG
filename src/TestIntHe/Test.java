package TestIntHe;

public class Test {
	static      String a = "Credit";
	static		String b = a;
	static		String c = "Debit";
	static		String  d = "santander";
	
	
   public static void main(String[] args) {
	   approvalOfCreditCard("Debit");
   }
      
	   
  
	   
	   

   public static void approvalOfCreditCard(String variable) {
	
	   
		if(a.equals(b)) {
				 System.out.println("Approve credit card");	
		
	       if (c.equals(d))	{
					 System.out.println("Approve credit card");	
				}
			
			else {
				 System.out.println("Disapprove credit card");
			}
		}
   }		
   }
		
				
	  
//		If (a.equals(b)){
//		   If(b.equals(a)){
//		   System.out.println("Approve credit card");	
//		   }
//		   else  {
//		   System.out.println("Disapprove credit card");
//		   }
//		   }
//		   else  {
//		   If(C=False){
//		   If(D=True){
//			   System.out.println("Approve credit card");	
//		   }
//		   else {
//			   System.out.println("Disapprove credit card");
//		   }
//		   }
//		   }


