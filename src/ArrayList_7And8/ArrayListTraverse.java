package ArrayList_7And8;

import java.util.ArrayList;

public class ArrayListTraverse {
	
	//dynamic ArrayList

	public static void main(String[] args) {
		ArrayList <String> ar = new ArrayList<String>();
		ar.add("Tom");//0
		ar.add("Endrew");//1
		ar.add("Wally");//2
        ar.add("Paige");//3
        ar.add("Wally");//4
        ar.add("Elsa");//5
        
        //Traverse the ArrayList for loop
        System.out.println("--for loop---------");
        for(int i=0;i<ar.size();i++) {
        	System.out.println(ar.get(i));
        	
        	if(ar.get(i).equals("Paige")) {
        		System.out.println("Hi----");
        		break;
        	}
        	
        }
        
        
        //for each loop
        System.out.println("----for each loop--------");
        for(String e : ar) {
        	System.out.println(e);//Time Complexity of this both array is O(n)
        	
        	if(e.equals("Wally")) {
        		System.out.println("Bye---");
        		break;
        	}
        }
        
	}

}
