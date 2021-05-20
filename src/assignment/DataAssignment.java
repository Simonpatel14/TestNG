package assignment;

public class DataAssignment {

	public static void main(String[] args) {
		String a = "Hello";
		String b = "Sejal B";
		String c = "Selenium";
		char ch = 't';
	
		System.out.println(a);
		System.out.println("My name is  : "  + b);
		
		byte by  = 74;
		byte by1 = 36;
		byte by2 = 50;
		byte by3 = 3;//2
		byte by4 = by3--;
		byte by5 = 15;
		byte by6 = -3;
		System.out.println("Sum of : " + (by+by1));
		System.out.println(by2/by4);
		
		byte i = -5;
		byte i0 = 5;
		byte i1 = 8;
		byte i2 = 6;
		byte i3 =55;
		byte i4 = 9;
		byte i5 = 20;
		System.out.println(i+(i1*i2));
		System.out.println((i3+i4)%i4);
		System.out.println(i5+((by6*i0)/8));
		System.out.println(i0+(by5/by4*by3)-(i1%by4));
		
		
		double f  =  25.5;
		double f1 =  3.5;
		double f2  = 40.5;
		double f3  = 4.5;
	    System.out.println(((f*f1)-(f1*f1))/(f2-f3));
		System.out.println(a+" "+c+ch);
		
		int m = 100;
		int n = 200;
		int o = 3400;
		System.out.println("Your Total amount is. "  + (m+n+o));//I can't put . at the end 
		
		byte by7 = 065;
		System.out.println(by7);//output 53 don't understand it.
	}

}
