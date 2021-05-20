package assignment;

public class SwitchCaseAssignmentForBrowserAndMarks {
	
	   //WAF where you have to pass student name(String) and return marks(Integer)

		public int getStudentNameAndMarks(String studentName) {
			System.out.println("getting studentname and marks for " + studentName);
			
			int marks = -1;
			
			switch (studentName) {
			case "Alisha":
			    marks = 90;
				break;
			case "Veera":
				marks = 80;
				break;
			case "Slyvaster":
				 marks =70;
			     break;
			case "Ruth":
				marks = 50;
				break;
				 
			default:
				System.out.println(studentName + " not found on the list ");
				break;
			}
			return marks;
			
		}
		
		// WAF where have to pass browser name(String) and return boolean
		
		public boolean launchBrowser(String browser){
			System.out.println("launch browser " + browser);
			//Switch case
			boolean launch = false;
			
			switch (browser) {
			
			case "Chrome":
				System.out.println("Chrome is launched ");
				launch = true;
			break;

			case "FireFox":
				System.out.println("FireFox is launched "); 
				launch = true;
			break;
			
			case "IE":
				System.out.println("IE is launched ");
				launch = true;
			break;
			
		    default:
		    	System.out.println("Please pass correct browser name.. "  + browser );
				break;
			}
			return launch;
			
			
		}
		
		
		
		

	public static void main(String[] args) {//java always look foe psvm with String a []
		//public static void main (String a[])
		SwitchCaseAssignmentForBrowserAndMarks obj = new SwitchCaseAssignmentForBrowserAndMarks(); 
		
		   int m4 = obj.getStudentNameAndMarks("Slyvaster");
		   System.out.println(m4);
		   
		   m4 = obj.getStudentNameAndMarks("Tom");
		   System.out.println(m4);
		   
		  boolean b = obj.launchBrowser("Chrome");
		  System.out.println(b);
		  if(b) {
			  System.out.println("enter the url...");
		  }
		  else {
			  System.out.println("No browser found");
		  }  
		
          b= obj.launchBrowser("Safari");
              System.out.println(b);
              if(b) {
        		  System.out.println("enter the url...");
        	  }
              else {
        		  System.out.println("No browser found");
        	 }  
        		
	}

}
