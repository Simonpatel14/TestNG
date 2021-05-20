package OOP_Encapsulation;

public class TestComp {

	public static void main(String[] args) {
		Company c1 = new Company("IBM",200,"Financial");
		Object ar [] = c1.getCompInfo();
		 for (Object e : ar) {
			 System.out.println(e);
		 }
		
//		c1.setName("IBM");//set set the value it not return anythings
//		c1.setPolicy("Financial");
//		c1.setSharePrice(100);
//		System.out.println(c1.getName()+ " "+c1.getPolicy() + " " + c1.getSharePrice());
//		
		

	}

}
