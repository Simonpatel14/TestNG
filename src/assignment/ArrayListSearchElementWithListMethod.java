package assignment;

import java.util.List;
import java.util.ArrayList;

public class ArrayListSearchElementWithListMethod {

	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<Integer>();
		num.add(100);
		num.add(200);
		num.add(300);
		
		int i = num.indexOf(200);
		int p = num.indexOf(400);
		
			 if (i==-1) {
				System.out.println("Element not found with index in ArrayList ");
				
			}
			else {
				System.out.println("Element found with Index of  " + i);
				
		}
			 if(p==-1) {
				 System.out.println("Element not found in ArrayList");
			 }
			 else {
				 System.out.println("Element found with Index of  "  + p);
			 }
		}
		
		
		
	}


