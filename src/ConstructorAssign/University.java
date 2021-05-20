package ConstructorAssign;

import java.util.ArrayList;

public class University {
	
	/*1. Design a University class template with the following features:
		 variables:name,country,stablishedDate,stablishedDate*/
	    String name;
		String country;
	    String stabilishedDate;
		

		
		//*--Design the constructor of this class with different parameters and all parameters.
		public University(String name,String country,String stabilishedDate) {
			this.name = name;
			this.country = country;
			this.stabilishedDate = stabilishedDate;
			
		}
	
		//--Write the get method of each variable with return keyword.
		public Object[] getUniInfo() {
			getCourseList();
			Object uni [] = new Object [4];
			uni [0] = name ;
			uni [1] = country;
			uni [2] = stabilishedDate;
			uni [3] = getCourseList();
		    return uni;
		    

			
		}
		public ArrayList<String> getCourseList() {
		
		ArrayList <String> cou = new ArrayList<String>();
		cou.add("ITcourse");
		cou.add("Mechanical Course");
		cou.add("Civil Engineer course");
		cou.add("Computer Course");
		return cou;
		}
		
	
			
	

}
