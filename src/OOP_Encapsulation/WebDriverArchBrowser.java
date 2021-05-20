package OOP_Encapsulation;

public class WebDriverArchBrowser {
	
       public void launchBrowser() {
    	   System.out.println("launching the browser");
    	   checkBrowserVersion();
	
      }
       
       private void checkBrowserVersion() {
    	   System.out.println("checkBrowserVersion");
    	   checkRAMSpace();
       }
       
       private void checkRAMSpace() {
    	   System.out.println("chechRAMSpace");
    	   OSCompatibility();
    	   
       }
       
       private void OSCompatibility() {
    	   System.out.println("OSCompatibility");
    	   needUpgrade();
    	   
       }
        private void needUpgrade() {
        	System.out.println("need upgrade");
    	   
       }
       
       
       
       
       
       
       
       
       
}
