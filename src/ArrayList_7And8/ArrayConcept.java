package ArrayList_7And8;

import java.util.Arrays;

public class ArrayConcept {

	public static void main(String[] args) {
		//Static array : size is fixed
		// two limitation
		//1. size is fixed : 
		    //a. if you have more segments but data is less : wastage of memory
		   // b. if you have less segments but data is more : don't have segments to store value
		
		//2.It can store only similar types of data
		
		//single dimension array
		
		//Array Literals
		int marks[] = {10,20,60,50,60,70};
		System.out.println(marks.length);//6
		System.out.println(marks[5]);
		
		//to sort array need to use array.sort
		Arrays.sort(marks);
		
		for (int e : marks)
		System.out.println(e);
		
		
		
		
		//1.int array
		System.out.println("******************************************************");
		int i [] = new int[4];
              i[0] = 10;
              i[1] = 20;
              i[2] = 30;
              i[3] = 40;
             
              System.out.println(i[0]);
              System.out.println(i[3]);
             // System.out.println(i[4]);//java.lang.ArrayIndexOutOfBoundsException
              //System.out.println(i[-1]);//java.lang.ArrayIndexOutOfBoundsException
              System.out.println("The length of the Array is : "  + i.length);
              
              //print all values from the array : use for loop
              System.out.println("-------for loop------");
              for(int k = 0; k<i.length; k++) {
            	  System.out.println(i[k]);
              }
              System.out.println("-------foe each------");
               for (int e : i) {
            	   System.out.println(e);
               }
              System.out.println("----------------------");
              
              //double array
        double d [] = new double[2];
        d[0] = 12.22;
        d[1] = 23.33;
        
        System.out.println(d[0]);
        System.out.println(d[1]);
       // System.out.println(d[2]);ArrayOutOfBoundException
        //default value is 0.0
        
        
        double d1[] = new double [99];
        //li = 0
        //hi = 98 l-1
        //l = 99 hi+1
        
        //char array
        char c [] = new char [4];
        c[0] = 'a';
        c[1] = 'b';
        c[2] = 'c';
        c[3] = 'd';
        System.out.println(c[3]);
        
        //String array
        String s [] = new String [4];
        s[0] = "Java";
        s[1] = "Python";
        s[2] = "Ruby";
        s[3] = "c#";
        
        System.out.println("-----for loop------");
        for(int p=0; p<s.length ; p++) {
        	System.out.println(s[p]);
  	
        }
        System.out.println("---for each loop-----");
        //for each loop
        for(String e : s) {
        	System.out.println(e);
        }
        
        //create an array where you want to store different type of data with static array
        //emp info : name,age,'m',34.44,true
        //to use this data we need to create object static array
        
        Object ob [] = new Object[5];
        ob[0] = "Peter";
        ob[1] = 20;
        ob[2] = 'm';
        ob[3] = 34.44;
        ob[4] = true;
        
       for(int j=0;j<ob.length; j++) {
    	   System.out.println(ob[j]);
       }
        
       //for each
       for(Object e : ob) {
    	   System.out.println(e);
       }
       //boolaen array
       
       boolean b1 [] = new boolean[2];
       b1[0] = true;
       b1[1] = false;
       
       System.out.println(b1[0]);
       
       
       //2darray : two dim array:
       //use case : TestNG -- data provider + with selenium---> data driven
       //nested loops
       
       //2dimensions array
       
       int dd [] []= new int [8] [8];
         for(int h =0; h<dd.length;h++) {
        	 for(int j=0; j<dd[0].length;j++) {
        		 System.out.print(h +""+ j+" ");
        	 }
        	 System.out.println();
         }
       
       
       
	}

}
