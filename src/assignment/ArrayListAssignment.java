package assignment;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListAssignment {

	public static void main(String[] args) {
		// WAP to create a new array list, add some colours (string) and print out the collection
		ArrayList <String>colours = new ArrayList <String>();
		 colours.add("Red");//0
		 colours.add("Blue");//1
		 colours.add("Pink");//2
		 colours.add("Green");//3
		 
		 System.out.println("Size of ArrayList  : " + colours.size());
		 colours.add("Mustard");//4
		 colours.add("Magnolia");//5
		 System.out.println(colours);//this is not right way to print collection of ArrayList so always use advanced for loop or for loop
		 
		 System.out.println("----Printing Collection of Arraylist with for loop--------");
		 for(int i=0;i<colours.size();i++) {
			 System.out.println(colours.get(i));
				 }
		
        // WAP to insert an element into the array list at the first and last positions.
		 System.out.println("-----Insert element at First index with for each loop--------");
		 colours.add(0,"Brown");
		 
		 for(String e : colours) {//Advanced for loop
			 System.out.println(e);
		 }
		  
		 System.out.println("----Insert element at last index-----");
		 colours.add(colours.size(),"White");//6
		 System.out.println(colours);

        // WAP to retrieve an element (at a specified index) from a given array list.
		 System.out.println("------Retrieve an element from ArrayList--------");
		 System.out.println(colours.get(4));//it helps to retrieve the element at index
		 
        // WAP to update specific array element by given element.
		 System.out.println("---Update Secific Element--------");
		 colours.set(4, "Purple");
		 System.out.println(colours);
		 
		 System.out.println("--------- remove the third element from a array list---------"); 
		  
		 colours.remove(2);// remove by Index
		   colours.remove("Pink");//remove by name 
		   System.out.println(colours);
		 
         
		   System.out.println("---------search an element in a array list------"); 
		     int i = colours.indexOf("Purple");
		   
                if(i==-1) {
                	System.out.println("Element not in ArrayList");
        		    }
                
                else {
               	    System.out.println("Element in ArrayList at index of " + i);
                	}
                
         // WAP to reverse elements in a array list
                System.out.println("-------Reverse elements in ArrayList----------");
                for(int j= colours.size()-1; j>=0; j--) {
                	System.out.println(colours.get(j));
                	}
                System.out.println("------- Other way Reverse elements in ArrayList----------");
                Collections.reverse(colours);
                System.out.println(colours);
                
          // WAP to extract a portion of a array list.
                System.out.println("---------extract a portion of a array list------------");
               ArrayList<String> extract= new ArrayList<String> (colours.subList(0, 3));//in sublist last number doesn't includes
               System.out.println("Extract(Sublist) from Arraylist : " + extract);
          
          // WAP of swap two elements in an array list.
               System.out.println(" ---------------swap two elements in an array list------------");
               System.out.println("Before Swap the arraylist :  "  + colours);
               
             Collections.swap(colours, 2, 1);
                System.out.println("Ater Swaping the ArrayList  : " + colours);
        
        // WAP to empty an array list.
                System.out.println("-------------------------empty an array list------------");
               colours.clear();
               System.out.println("Empty arraylist by using Clear : " + colours);
               System.out.println("Is arraylist Empty after clear  : " + colours.isEmpty());
               
          System.out.println("----------Otherway to Empty ArrayList-----------");
               	colours.removeAll(colours);
               	System.out.println("Empty ArrayList By using removeall Method  :  " + colours);
               		
        // WAP to trim the virtual capacity of an array list the current list size.
            	ArrayList <Integer> num = new ArrayList<Integer>(20);
        		num.add(10);
        		num.add(20);
        		num.add(30);
        		num.add(40);
        		num.add(50);
        		num.add(60);
        		num.add(70);
        		num.ensureCapacity(70);
        		System.out.println("ArrayList after ensurecapacity : " + num.size());
        		num.trimToSize();
        		
        		System.out.println("ArrayList after trimTosize  : "  + num);//this is not working in my eclipes please Explain
               	
        // WAP to print all the elements of a ArrayList using the position of the elements
        	System.out.println("---------------All the elements of a ArrayList using the position of the elements----------");	
        	int index = 0;	
        	System.out.println(num.size());
        	for(Integer e : num) {
        	
        		System.out.println(index++ + " Index "  + " element is : " + e);
        		
        		}
        	
        	int k = 0;
        	for (int j =0;j<num.size();j++) {
        		System.out.println(k++ + "Index" + "element is : " + num.get(j));
        	}
        		
	}
}
