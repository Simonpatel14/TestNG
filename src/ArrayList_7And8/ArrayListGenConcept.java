
package ArrayList_7And8;

import java.util.ArrayList;

public class ArrayListGenConcept {

	public static void main(String[] args) {
		
		//Generic ArrayList
		ArrayList <String> ar = new ArrayList<String>();
		System.out.println(ar.size());
		
		
		ar.add("Tom");
		ar.add("Endrew");
		ar.add("Wally");
		
		//System.out.println(ar.get(3));	//IndexOutOfBoundsException	
		//System.out.println(ar.get(-1));	//IndexOutOfBoundsException	
		
		//Integer ArrayList
		ArrayList <Integer>marks =new ArrayList<Integer>();
		     marks.add(100);
		     marks.add(200);
		     marks.add(300);
		
		System.out.println(marks.get(2));
		
		//for multiple data input
		ArrayList<Object>mix = new ArrayList<Object>();
		  mix.add("Sally");//0
		  mix.add('S');    //1
		  mix.add("02/01/1920");//2
		  mix.add(100);//3
		  mix.add("Sally");//4
		  mix.add('S');    //5
		  mix.add("02/01/1920");//6
		  mix.add(100);         //7
		  mix.add("02/01/1920");//8
		  mix.add(100);          //9
		  mix.add(300);         //10
		  System.out.println(mix.get(1));
		  System.out.println(mix.size());
		  System.out.println(mix);
		  System.out.println(mix.remove(6));
		  System.out.println(mix.size());
		  
		  
		  

	}

}
