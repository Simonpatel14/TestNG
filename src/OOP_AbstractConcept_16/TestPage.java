package OOP_AbstractConcept_16;

public class TestPage {

	public static void main(String[] args) {
		
		LoginPage lp = new LoginPage();//calling constructor automatically while creating object of child class
		
		lp.header();
		lp.title();
		
		lp.doLogin("admin", "admin123");
		lp.pageloading();//runtime poly morphisim
		Page.logo();
		
		
		
		
		//object of Page class
		//Page pg = New Page();//not allowed to create object
		
		//Top casting
		Page pg = new LoginPage();
		pg.title();
		pg.header();
		pg.pageloading();
		
		System.out.println(Page.i);
		
		
		//down casting
		//LofinPage lp1 = (LoginPage)new Page();this is not allowed
		
		
		
		
		
		
		
		
		

	}

}
