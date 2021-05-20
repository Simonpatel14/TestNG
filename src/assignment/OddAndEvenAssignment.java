package assignment;

public class OddAndEvenAssignment {

	public static void main(String[] args) {
	        
		int i=0;
		System.out.println("---While loop for even number-----");
		while(i<=10) {
			if(i % 2 ==0) {
				System.out.println(i);
			}
			i++;	
		}
		
		//for loop
		System.out.println("---for loop for even number-----");
		for(i=0;i<=10;i++) {
		   if(i % 2 ==0) {
			   System.out.println(i);
			   
		   }	
			
		}
		//do while
		System.out.println("---do while loop for even number-----");
		int i1=0;
		do {
			if((i1 % 2==0)) {
				System.out.println(i1);
			}
			//while using if condition in the do while loop write i++after{} bracket
			i1++;
		} 
		while (i1<=10);
		
		
           //Print odd number
		System.out.println("-----while loop for odd number------");
		int a1=0;
		
		while(a1<=10) {
			
			if(a1 % 2 == 1) {
				System.out.println(a1);
			}
			a1++;
		}
		
		System.out.println("-----for loop for odd number------");
		
		for(i=0;i<=10;i++) {
		
		     if(i % 2 ==1){
		    	 System.out.println(i);
		    	 }	
		      }
		System.out.println("-----do while for odd number------");
		 int a2=0;
		do {
           if(a2 % 2==1) {
        	   System.out.println(a2);
        	   
        	   }
           a2++;
           }
		while(a2<=10);
			
	}

}
