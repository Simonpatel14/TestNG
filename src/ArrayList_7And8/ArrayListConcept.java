package ArrayList_7And8;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListConcept {

	public static void main(String[] args) {
	
	//arrayList is default class in java
    //maintains the indexing (orders)
	//this is raw type array	
		
		ArrayList ar = new ArrayList();
		System.out.println("-----Size of ArrayList after immediate intializing-----");
		System.out.println(ar.size());
		
		ar.add(10);
		ar.add(20);
		ar.add(30);
		System.out.println(ar.get(0));
		System.out.println(ar.size());
		
		ar.add("Testing");
		ar.add(12.33);
		ar.add('c');
		ar.add("Tom");
		ar.add(true);
		
		System.out.println(ar.size());
		System.out.println("LI = " + 0);
		System.out.println("HI = " + (ar.size()-1));
		
		//To print all values of ArrayList
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
	ArrayList <String> linkList = new ArrayList<String>(5);
	       linkList.add("Home");
	       linkList.add("Log in");
	       linkList.add("Contact us");
	       System.out.println(linkList);
	       linkList.remove(0);
	       System.out.println(linkList);
	       linkList.trimToSize();
	       System.out.println(linkList);
	       
	       
	       
			ArrayList<Integer> num = new ArrayList<Integer>();
			num.add(100);
			num.add(20);
			num.add(300);
			num.add(99);
			num.add(98);
			System.out.println(num);
			
			Collections.sort(num);
			System.out.println(num);
		
		
	}

}
