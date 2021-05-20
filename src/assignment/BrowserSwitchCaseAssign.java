package assignment;

public class BrowserSwitchCaseAssign {

	public static void main(String[] args) {
		
		String browser = "FIREFOX";
		
		switch (browser.toLowerCase()) {//for upper case we need to use .toUppercase()& change data respectively
		case "chrome":
			System.out.println("Launch chrome Browser");
			break;
		case "firefox":
			System.out.println("Launch FireFox Browser");
			break;
		case "internetexplorer":
			System.out.println("Launch InternetExplorer Browser");
			break;
         
		default:
			System.out.println("Please pass the correct name of the browser");
			break;
		}
	
	}

}
