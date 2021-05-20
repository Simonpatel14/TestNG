package Operators_3;

public class IncrementAndDecrementOperators {

     public static void main (String[] arg) {
    	 //post increment and pre increment
    	 int a = 8;
    	 int b = a++;
         int c = ++a;
         int d = b++;
         
    	 System.out.println(b);//9
    	 System.out.println(a);//10
    	 System.out.println(c);//10
    	 System.out.println(d);//8
    	 
    	 //Pre Increment
    	 int i1 = 9;
    	 int i2 = ++i1;
    	 System.out.println(i1);//10
    	 System.out.println(i2);//10
    	 
//    	 pre decrement
    	  double d1 = 23.22;
    	  double d2 = --d1;
    	  System.out.println(d1);//22.22
     	  System.out.println(d2);//22.22
     	 
     	 //post decrement
     	 float f = 54.55f;
     	 float f1 = f--;
     	  System.out.println(f);//53.55
     	  System.out.println(f1);//54.55
     	  System.out.println(f--);//5.55
     	  System.out.println(f);//54.55
     	  
    	 
	

	}

}
