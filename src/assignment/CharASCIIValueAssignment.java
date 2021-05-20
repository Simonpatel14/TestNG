package assignment;

public class CharASCIIValueAssignment {

	public static void main(String[] args) {
	     int c='a';
	     char c1 ='a';
	     
	     System.out.println("--------ASCII Value from 'a to z'with for loop ------");
	     
	     for(c1='a';c1<='z';c1++) {
	    	 
	    	 if(c1==c) {
	    		 
	    		 System.out.println("ASCII Value "  +  c1 + " is " + c );
	    	 }
	     }
 System.out.println("--------ASCII Value from 'a to z'with for loop ------");
	     
	     for(c='a';c<='z';c++) {
	    		 
	    		 System.out.println("ASCII Value is " + c );
	     }
	     
	     
	     
	    System.out.println("--------ASCII Value from 'a to z'with while loop------");
	    	int c2 ='a';
	    while(c2<='z') {
	    		System.out.println(c2);
	    		c2++;
	    	}
	    
	    
	    System.out.println("--------ASCII Value from 'a to z'with do loop------");
	    
	    int b ='a';
	     do {
				System.out.println(b);
				 b++;
	     }
		 while (b<='z');
	    	 
	     

	}

}
