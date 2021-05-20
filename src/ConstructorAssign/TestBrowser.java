package ConstructorAssign;

import java.util.ArrayList;

public class TestBrowser {

	public static void main(String[] args) {
		// Microsoft (Internet Explorer and Edge), Google (Chrome), Apple (Safari), Opera Software (Opera) and Mozilla (Firefox).
		ArrayList <String> diffPlugin = new ArrayList <String>();
		diffPlugin.add("Adobe Flash Plyer");
		diffPlugin.add("VLC Plugin");
		diffPlugin.add("Google talk");
		diffPlugin.add("Adobe Reader");
		
		Browser br = new Browser("Crome");
		System.out.println(br.getBrowserName());
		
		System.out.println("----------------------------------");
		
		Browser br1 = new Browser("IE & Edge","Microsoft","16.45");
		System.out.println(br1.getBrowserName() +" "+ br1.getCurrentVersion()+" " +br1.getVendorName());
		
		System.out.println("------------------------------------");
		Browser br2 = new Browser("Safari","Apple","16",diffPlugin);
		System.out.println(br2.getBrowserName() +" "+ br2.getCurrentVersion()+" " +br2.getVendorName());
		
		System.out.println( br2.plugins);
		System.out.println(br2.plugins.size());
		
      	for (int i=0;i<br2.plugins.size();i++) {
			System.out.println(br2.plugins.get(i));
		
	 }
    
      	System.out.println("---------------------------------------");
	    
	   Browser br3 = new Browser("Opera","74.0.39",diffPlugin);
		System.out.println(br3.getBrowserName() +" " +br3.getCurrentVersion());
		
		System.out.println( br3.plugins);
	
	  	System.out.println("----------For each loop-------------");
	   
	  	for (String e : br3.plugins) {
	    	System.out.println(e);

	}

}
}
