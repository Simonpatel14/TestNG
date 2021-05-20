package assignment;

public class ConditionalOperatorsAssign {

	public static void main(String[] args) {
		
		int i  = 25;
		int i1 = 87;
		int i2 = 78;
		int i3 = 91;
		
		if(i>i1 && i>i2) {
			System.out.println("The Greatest number is : " + i);
		}
		else if(i1>i2) {
			System.out.println("The Greatest number is : "  + i1);
		}
		
		else {
			System.out.println("The Greatest number is : "  +i2);
		}
		
		if(i>i1 && i>i2 && i>i3) {
			System.out.println("The Greatest number is : " +  i);
		}
		else if(i1>i2 && i1>i3) {
			System.out.println("The Greatest number is : "  + i1);
		}
		else if (i2>i3) {
		System.out.println("The Greatest number is : "  +i2);
	    }
	    
	else {	  
     	System.out.println("The Greatest number is : "  + i3);
	    }
	
         int number= 35;
        
         if(number > 0) {
        	 System.out.println("Input Number is : " + number + " is positive number ");
         }
         else if(number < 0) {
        	 System.out.println("Input Number is :"  + number + " is negative number ");
         } 
         else {
        	 System.out.println("number is either not postive or negative but id 0");
         }
        
         int number1= -11; 
         
         
         if(number1>0) {
        	 System.out.println("Input Number is : " + number1 + " is positive number ");
          }
          else if(number1 < 0) {
              System.out.println("Input Number is :"  + number1 + " is negative number ");
          } 
          else {
              System.out.println("number is neither postive nor negative ");
          }
         
         int age =0;
         boolean isAlive = true;
         
         if( age>=18 && isAlive) {
        
        	 System.out.println("8");
        	
         }
         else if (age<18 && age >=1  && isAlive) {
        	 System.out.println("Person not eligible for vote");
         }
         
         else  {
        	 System.out.println("person does not exist");
         }
     
        	 
         }
		
	}

