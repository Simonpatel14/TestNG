package assignment;

public class LoopConceptAssignment {

	public static void main(String[] args) {
		
	String s = "I am Batman";
	int i = 0;
	
	while(i<=4) {
		System.out.println(s);
		i++;
	}
	
	
	int i1 = 1;
	System.out.println("--------While loop----------");
	
	while(i1<10) {
		System.out.println(s + " " +  i1);
		i1++;
	}
	int i2=10;
	
	while (i2>0){
		System.out.println(i2);
		i2--;
	}	
	System.out.println("-------do while loop----------");
	int a =10;
	
	do {
		System.out.println(a);
		a--;
	}
	while(a>=1);
	
	System.out.println("---------For loop------------");
	
	for(int b=10;b>=1;b--) {
		System.out.println(b);
	}
	
	
	int a2 =1;
	while(a2<=10) {
		
		System.out.println("Hello World"); 
		a2++;
	}
	
	int i3= 1;
    while(i1 <= 10) {
			System.out.println(i3);
			if(i3 % 7==0) {
				System.out.println("Quit");
				break;
			}
			i3++;	
			}
	    
    
	
	
	
	}


	}


