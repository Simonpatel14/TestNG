package OOP_InterfaceSeleniumArch;

public class SafariDriver implements WebDriver {
	
	public SafariDriver ( ) {
		System.out.println("launch Safari browser.....");
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
