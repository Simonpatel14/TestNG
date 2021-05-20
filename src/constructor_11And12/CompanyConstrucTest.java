package constructor_11And12;

public class CompanyConstrucTest {

	public static void main(String[] args) {
		
		CompanyConstruc c0 = new CompanyConstruc();
		c0.name = "ABC";
		System.out.println(c0.name);
		
		
		CompanyConstruc c1 = new CompanyConstruc("IBM",1000);
		
		System.out.println(c1.name);
		System.out.println(c1.empCount);
		
		CompanyConstruc c2 = new CompanyConstruc("MS",2000,"Mumbai");
		System.out.println(c2.name + " "+ c2.empCount+ " "+c2.city);
		System.out.println(c2.address);
		
		CompanyConstruc c3 = new CompanyConstruc("TCS",5000,"Pune","test Address","TATA");
		System.out.println(c3.name);
		System.out.println(c3.ceoName);
		
		System.out.println(c1.ceoName);//null check ref 
		
		
		
		
		
		
		
		//lecture = 11
//		CompanyConstruc c1 = new CompanyConstruc(); //default constructor...
//		//c1.company; please don't do this because we const..is called at the time of object created
//		
//		CompanyConstruc c2 = new CompanyConstruc(10); //one parameter....
//		CompanyConstruc c3 = new CompanyConstruc(20,30); // two parameter
//		
	}

}
