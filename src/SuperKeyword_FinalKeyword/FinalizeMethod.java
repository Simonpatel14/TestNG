package SuperKeyword_FinalKeyword;

public class FinalizeMethod {

	public static void main(String[] args) {
		
		String name = "Tom";
		
		FinalizeMethod obj = new FinalizeMethod();
		obj = null;
		
		Window w1 = new Window();
		w1 = null;
		
		System.gc();	
	}
    
	@Override
	public void finalize() {
		System.out.println("FinalizeMethod---finalize");
		
	}
	
	
}
