package ConstructorAssign;



public class TestUniversity {

	public static void main(String[] args) {
//
//			ArrayList <String> cList = new ArrayList<String>();
//			cList.add("ITcourse");
//			cList.add("Mechanical Course");
//			cList.add("Civil Engineer course");
//			cList.add("Computer Course");
		
		University uni = new University("Mumbai University", "India","21/02/2021");
		      Object a [] = uni.getUniInfo();
		      for (Object e : a) {
		    	  System.out.println(e);
		      }
	
		System.out.println("-------------------------------------");
		
		University uni1 = new University ("Oxford University","UK","21/02/2021");
		Object a1 [] = uni1.getUniInfo();
		for(Object e : a1) {
			System.out.println(e);
		}
	    

	}

}
