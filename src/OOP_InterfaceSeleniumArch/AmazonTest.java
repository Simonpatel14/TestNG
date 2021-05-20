package OOP_InterfaceSeleniumArch;

public class AmazonTest {

	public static void main(String[] args) {
		WebDriver driver= null;
		String browser = "Safari";
		
		//ChromeDriver driver = new ChromeDriver();
		//FireFoxDriver driver =new FireFoxDriver();
		//SafariDriver = new SafariDriver();
		//cross browser testing
		switch (browser) {
		case "Chrome":
		    driver = new ChromeDriver();
			break;
		case "FireFox":
			driver = new ChromeDriver();
			break;
		case "Safari":
			driver = new ChromeDriver();
			break;

		default:
			break;
		}
		
		driver.get("http://www.amazon.com"); 
		String title = driver.title();
		System.out.println(title);
		driver.click("sign up link");
		driver.sendkey("frist name", "Sejal");
		driver.quit();
        
	}

}
