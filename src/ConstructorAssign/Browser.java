package ConstructorAssign;

import java.util.ArrayList;

public class Browser {
	/*2. Design a browser class template with the following features:
		 variables: browserName,vendorName,currentVersion,List of plugins supported by Browser in Array List<String>*/
        String browserName;
        String vendorName;
        String currentVersion;
        ArrayList<String> plugins;
		
         //--Design the constructor of this class with different parameters and all parameters.
       
        public Browser(String browserName, String vendorName, String currentVersion, ArrayList<String> plugins) {
			this.browserName = browserName;
			this.vendorName = vendorName;
			this.currentVersion = currentVersion;
			this.plugins = plugins;
		}

		public Browser(String browserName, String currentVersion, ArrayList<String> plugins) {
			this.browserName = browserName;
			this.currentVersion = currentVersion;
			this.plugins = plugins;
		}

		public Browser(String browserName, String vendorName, String currentVersion) {
			this.browserName = browserName;
			this.vendorName = vendorName;
			this.currentVersion = currentVersion;
		}

		public Browser(String browserName) {
			this.browserName = browserName;
			
		}
		
		//--Write the get method of each variable with return keyword. 

		public String getBrowserName() {
			return browserName;
		}

		public String getVendorName() {
			return vendorName;
		}

		public String getCurrentVersion() {
			return currentVersion;
		}

		public ArrayList<String> getPlugins() {
			return plugins;
		}

	
		
	     
		
		
		
		
		

}
