package constructor_11And12;

public class TestWngCompanyConst {
	public static void main (String []args) {//do you think this is TDS job TDS 
		/*this is TDS job to call all methods by creating objects
	       thats why constructor come in to the picture*/
	       CompanyConstruc c1 = new CompanyConstruc();
	       c1.name = "Cetara";
	       c1.city = "Mumbai";
	       System.out.println(c1.name +" "+ c1.city);

			
			CompanyConstruc c2 = new CompanyConstruc();
			c2.name = "IBM";
			c2.city = "Benglore";
			System.out.println(c2.name +" "+ c2.city);

			CompanyConstruc c3 = new CompanyConstruc();
			c3.name = "MS";
			c3.city = "Ahmedabad";
			System.out.println(c3.name +" "+ c3.city);
	}
}


