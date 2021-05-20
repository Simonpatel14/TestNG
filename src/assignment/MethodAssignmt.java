package assignment;

public class MethodAssignmt {
	
	//WAP to print the sum of two numbers entered by defining your own method.
	
	public void doSum(int a,int b) {
		System.out.println("sum of number " + a +" and " + b + " is : ");
		int c = a+b;
		System.out.println(c);
		
	}
	//WAP to define a method that returns the product of two numbers entered 
	public int doMultiply(int a,int b) {
		System.out.println("Multiply of " + a +" and " + b + " is : ");
		int c = a*b;
		return c;
	}
	//WAP to print the circumference and area of a circle of radius entered by defining your own method.
	public double circumOfCircle(int redius) {
		System.out.println("-------Circumference of the Circle----------------");
		double c = Math.PI*2*redius;
		return c;
	}
    public double areaOfCircle(int redius) {
	    System.out.println("-------Area of the Circle----------------");	
		double c = Math.PI*(redius*redius);
		return c;
	}
    
    //Define two methods to print the maximum and the minimum number respectively among three numbers entered.
    public void findMaximum(int a,int b,int c) {
    	System.out.println("Method to find Maximum number " +a +" "+ b + " " + c);
    	if(a>b && b>c) {
    		System.out.println("Maximum number is :" + a);
    	}
    	else if(b>c) {
    		System.out.println("Maximum number is : "+ b);
    	}
    	else {
    		System.out.println("Maximum number is : " + c);
    	}
    }
    	
    public void findMinimum(int x,int y,int z) {
    	System.out.println("Method to find Minimum number " +x +" " + y + " " + z);
    	if(x<y && y<z) {
    		System.out.println("Minimum number is :" + x);
    		
    	}
    	else if(y<z) {
    		System.out.println("Minimum number is : " + y);
    	}
    	else {
    		System.out.println("Minimum number is : " +z);
		}
    }
    	
    	// Define a program to find out whether a given number is even or odd.
    	public int getOddAndEvenNumber(int num) {
    		System.out.println("Function to find odd and even number : " + num);
    		
    		if(num % 2==0) {
    			System.out.println(num + " is even number.");
    		}
    		else {
    			System.out.println(num + " is odd number." );
    		}
    		return num;
    		
    	}
    	// A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.
    	
    	public boolean findEligibleForVote(int age) {
    		
    		boolean Eligible = false;
    		if(age>=18 && !Eligible) {
    			System.out.println("Person is eligible for vote");
    		}
    		else {
    			System.out.println("Person is not eligible for vote");
    		}
    		
    		return Eligible;
    		
    		
    	}
   
        //WAP which will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:
        //Marks        Grade
        //91-100         AA
        //81-90          AB
        //71-80          BB
        //61-70          BC
        //51-60          CD
        //41-50          DD
        //<=40          Fail
    	
    	public String getGradeAsPerMarks(int marks) {
    		System.out.println("---------Getting grade as per marks--------");
    		String output=null;
    		if(marks>=91 && marks<=100) {
    			output = "AA";
    		}
    			
    		else if(marks>=81 && marks<=90) {
    			output = "AB"+ marks;
    			
    		}
    		else if(marks>=71 && marks<=80) {
    			output = "BB";
    			
    		}
    		else if(marks>=61 && marks<=70) {
    			output = "BC";
    			
    		}
    		else if(marks>=51 && marks<=60) {
    			output = "CD";
    			
    		}
    		else if(marks>=41 && marks<=50) {
    			output = "DD";
    			
    		}
    		else if(marks<=40) {
    			output = "Fail";
    			}
    		else {
    		output ="not applicable";
    		}
    		return output;	
    	}

        //8. Write a program to print the factorial of a number by defining a method named 'Factorial'.
        //The Factorial of any number n is represented by n! and is equal to 1*2*3*....*(n-1)*n. E.g.-
        //4! = 1*2*3*4 = 24
        //3! = 3*2*1 = 6
        //2! = 2*1 = 2
        //Also,
        //1! = 1
        //0! = 0
    	
    	public int factorial(int n) {
    		System.out.println("factorial number : " + n);
    	      int factorial=1;
    	    		  
    		for(int i =1;i<=n;i++) {
    			factorial = factorial*i;
    		}
    		return factorial;
    		
    		
    	}
        
	

	public static void main(String[] args) {
		MethodAssignmt s = new MethodAssignmt();
		s.doSum(50, 100);
		
		int sum = s.doMultiply(80, 20);
		System.out.println(sum);
		
		double circum = s.circumOfCircle(15);
		System.out.println(circum);
		
		double area = s.areaOfCircle(15);
		System.out.println(area);
		
		s.findMaximum(800,1000,6000);
		
		s.findMinimum(500, 600, 400);
		
		int n = s.getOddAndEvenNumber(80);
		System.out.println(n);
		int n1 = s.getOddAndEvenNumber(15);
		System.out.println(n1);
		
		
		boolean eligible = s.findEligibleForVote(18);
		System.out.println(eligible);
		boolean eligible1=s.findEligibleForVote(17);
		System.out.println(eligible1);
		
		String grade = s.getGradeAsPerMarks(40);
		System.out.println(grade);
		
		String grade1=s.getGradeAsPerMarks(85);
		System.out.println(grade1);
		String grade2 =s.getGradeAsPerMarks(90);
	    System.out.println(grade2);
		
		
		int fac = s.factorial(4);
		System.out.println(fac);
	   
		
	
	}

}
