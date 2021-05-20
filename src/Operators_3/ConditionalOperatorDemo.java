package Operators_3;

public class ConditionalOperatorDemo {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 20;
		//we can't write this code because this is ugliest way to write the code
		System.out.println("-------------- Logical operators---------");
		System.out.println(x==y);//false

		System.out.println("--------------Comparison or Relational operators------------");
		System.out.println (x<y);//true
		System.out.println (x>y);//false
		System.out.println(x>=y);//false
		System.out.println(x<=y);//true
		
		if(x==y) {//
			System.out.println("both are equal");}
		else {
			System.out.println("Both aren't equal");
		}
		System.out.println("-------------Dead code--------------");
		
		if(true) {
			// this is called dead code because we given true condition so only true condition satisfied on console it print only if not else
			System.out.println("both are equal");}
		else {
			System.out.println("Both aren't equal");}
		
		if(false) {
			// dead code because we given false condition so only false condition satisfied on console it print only else condition
			System.out.println("both are equal");}
		else {
			System.out.println("Both aren't equal");}
		
		boolean flag = false;
		if(flag) {
			System.out.println("This is fine: "  + flag);
			}
		else {
			System.out.println("This is not fine : " + flag);
			}
		double d = 12.33;
		double d1 = 23.33;
		if(d<d1) {
			System.out.println("This is Greater number : "  + d1);
		}
		else {
			System.out.println("This is smallest number : " + d);
		}
		
		//String comparison
		System.out.println("------String Comparison by .equal----");
		
		String s = "Selenium";
		String s1 = "SELENIUM";
		
		if(s.equals(s1)) {
			System.out.println("This both are equal");
		}
		else {
			System.out.println("This both are not equal");
			}
		System.out.println("------String Comparison by .equalsIgnoreCase----");
		
		if(s.equalsIgnoreCase(s1)) {
			System.out.println("This both are equal");
		}
		else {
			System.out.println("This both are not equal");
			}
		
		
		//WAP(write a programme)to check a mark
		
		System.out.println("----------if  else condition---------");
		String name = "Mary";
		
		if(name.equals("Tom")) {
			System.out.println("100 marks");
		}
		if(name.equals("Mary")) {
			System.out.println("90 marks");
		}
		if(name.equals("Maria")) {
			System.out.println("80 marks");
		}
		if(name.equals("Aisha")) {
			System.out.println("70 marks");
		}
		if(name.equals("Alina")) {
			System.out.println("25 marks");
		}
		else {
			System.out.println("No student found");
			
		}
		
		System.out.println("-----if else if condition--------");
        String day = "1";
		
		if(day.equals("1")) {
			System.out.println("Day " + day +" is "  + "Monday");
		}
		else if(day.equals("2")) {
			System.out.println("Day " + day +" is "  + "Tuesday");
		}
		else if(day.equals("3")) {
			System.out.println("Day " + day +" is "  + "Wednesday");
	    }
		else if(day.equals("4")) {
			System.out.println("Day " + day +" is "  + "Thursday");
		}
		else if(day.equals("5")) {
			System.out.println("Day " + day +" is "  + "Friday");
		}
		else if(day.equals("6")) {
			System.out.println("Day " + day +" is "  + "Saturday");
		}
		else if(day.equals("7")) {
			System.out.println("Day " + day +" is "  + "Sunday");
	    }
		else {
			System.out.println("Not on the list");
		}
	
		
	
		}
		
		
		
 }
	

		
		
		
		
	


