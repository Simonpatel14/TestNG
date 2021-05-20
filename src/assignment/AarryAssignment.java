package assignment;

public class AarryAssignment {

	public static void main(String[] args) {
	            
		Object ob [] = new Object[7];
		ob [0] = "Virat Kohali";
		ob [1] = 32;
		ob [2] = "Indian";
		ob [3] = "5/11/1988";
		ob [4] = 'M';
		ob [5] = 98.85;
		ob [6] = true;
		//boolean isAlive = true; //how we can print isActive on console  
		
		
	System.out.println("------------for loop-------------");
	   
	for (int i =0;i<ob.length; i++) {
			System.out.println(ob[i]);
	    }
	System.out.println("------while loop-------");
	   int a2=0;
	   while(a2<ob.length) {
		   System.out.println(ob[a2]);
		   a2++;
	   }
	  System.out.println("-----do while----------");
	     int a3 =0;
	     do {
	    	 System.out.println(ob[a3]);
	    	 a3++;
			
		} while (a3<ob.length);
	
	System.out.println("-----------------------");
	Object ob1 [] = new Object[7];
	ob1 [0] = "Jos Buttler";
	ob1 [1] = 30;
	ob1 [2] = "England";
	ob1 [3] = "8/09/1990";
	ob1 [4] = 'M';
	ob1 [5] = 108.04;
	ob1 [6] = true;
	
	  System.out.println("------for loop-----------");
	  for(int i1=0; i1<ob1.length; i1++) {
		  System.out.println(ob1[i1]);
		   }
	  
	  
	System.out.println("------while loop-------");
	   int a=0;
	   while(a<ob1.length) {
		   System.out.println(ob1[a]);
		   a++;
	   }
	  System.out.println("-----do while----------");
	     int a1 =0;
	     do {
	    	 System.out.println(ob1[a1]);
	    	 a1++;
			
		} while (a1<ob1.length);
	     
	     Object player []= {"Hardik Pandya",27,"Indian","11/11/1993",'m',194.44,true};
	  
	     System.out.println("----for loop----------");
	     
	     for (int c=0; c<player.length; c++) {
	     System.out.println(player[c]);
	     }

	}

}
