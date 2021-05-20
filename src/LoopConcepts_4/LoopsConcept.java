package LoopConcepts_4;

public class LoopsConcept {

	public static void main(String[] args) {
		
		//1 to 10
		//1. While loop:
		int i= 1;
		while(i <= 10) {
		System.out.println(i);
		i++;
		//++i
		//i+1
		}
       System.out.println("----------------------");
		int n=1;
       while(n <= 50) {
			System.out.println(n);
			
			if(n % 5==0) {
				System.out.println("Quit");
			}
		     n++;	
			}
		
		//break with while
       int i1 = 0;
       while(i1<=100) {
    	   System.out.println(i1);
    	   
    	   if(i1 == 50) {
    		   System.out.println("Half Century");
    	   }
    	   if(i1 == 100) {
    		   System.out.println("Century");
    	   }
    	   if(i1 == 0) {
    		   System.out.println("--duck out---");
    		   break;
    	   }
    	   i1++;
       }
       
       
       //2.for loop
       //1 to 10
       for(int k =1;k<=10;k++) {
    	   System.out.println(k);
    	   //k++   we can write here but this is not write way
       }
       
       for (double d=10.10;d<=10;d++) {
    	   System.out.println(d);
       }
       
       for(char c='a';c<='z';c++) {
    	   System.out.println(c);
       }
       
       //
//       for(;;) {
//    	   System.out.println("Welcome TAJ Hotel");
    //  }
       
        for (int m=1;m<=20;m++) {
        	System.out.println(m);
        	   if(m==15) {
        		   System.out.println("Value is 15");
        		   break;
        	   }
        	
        	  
        }
    	   
       //3.do while
        int m1 =0;
        do {System.out.println(m1);
        m1++;
			
		} while (m1<=10);
       
	}

}
