package LoopConcepts_4;

import java.util.ArrayList;

public class PageLinks {
	//WAF where you need to pass the page name and return the total links
	// and another function = return list of all the links text on the page
	
	public int getPagCount(String pageName) {
		System.out.println("getting the pagelinks for " + pageName);
		 
		int count = -1;
		switch (pageName) {
		case "Loginpage":
			count = 3;
			break;
		case "Homepage":
			count = 5;
			//System.out.println(pageName + " has " + count + " links");writing syso is not 
			break;

		default:
			System.out.println(pageName + " not found...");
			break;
		}
		return count;
		
	}
	public int getPageCount(String pageName) {
		System.out.println("getting the pagelinks for " + pageName);
		 
		int count = getPageLinksTextList(pageName).size();
		return count;
//		switch (pageName) {
//		case "Loginpage":
//			break;
//		case "Homepage":
//		    break;
//
//		default:
//			System.out.println(pageName + " not found...");
//			break;
//		}
	
	}
	
	public ArrayList <String> getPageLinksTextList(String pageName) {
		System.out.println("get page links text for " + pageName);
		 ArrayList <String> linksList = new ArrayList <String> ();
		  
		 if(pageName.equals("Loginpage")) {
			 linksList.add("Login");
			 linksList.add("About us");
			 linksList.add("Contact us");
		 }
		 else if(pageName.equals("Homepage")) {
			 linksList.add("Logout");
			 linksList.add("Setting");
			 linksList.add("Wishlist");
		 }
		 else {
			 System.out.println("Page is not available...");
		 }
		 return linksList;
		
		
	}

	public static void main(String[] args) {
		 PageLinks links = new  PageLinks();
		int p = links.getPagCount("Homepage");
		System.out.println(p);
		
		ArrayList <String> homeList =links.getPageLinksTextList("Homepage");
		System.out.println(homeList);
		
		int loginLinks = links.getPageCount("Loginpage");
          System.out.println(loginLinks);
		
		
	

	}

}
