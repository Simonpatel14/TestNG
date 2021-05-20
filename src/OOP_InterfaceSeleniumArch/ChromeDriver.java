package OOP_InterfaceSeleniumArch;

public class ChromeDriver implements WebDriver {
	
	
	public ChromeDriver ( ) {
		System.out.println("launch chrome browser.....");
	}

	@Override
	public void findElement() {
		System.out.println("findElemnet");
	}

	@Override
	public void get(String url) {
		System.out.println("launching url");
		
	}

	@Override
	public void click(String element) {
		System.out.println("click on element : " + element);
		
	}

	@Override
	public void sendkey(String element, String value) {
		System.out.println("enter value in element : " + element +"Value " + value);
		
	}

	@Override
	public String title() {
		System.out.println("title of the page....");
		return "some tiltle";
	
	}

	@Override
	public void quit() {
		System.out.println("quit the browser");
		
	}

	
}
