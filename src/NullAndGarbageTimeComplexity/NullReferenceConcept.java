package NullAndGarbageTimeComplexity;

public class NullReferenceConcept {
	String name;
	int age ;

	public static void main(String[] args) {
		
		NullReferenceConcept obj = new NullReferenceConcept();
		obj.name = "Sally";
		obj.age = 25;
		
		System.out.println(obj.name);
		System.out.println(obj.age);
		
		obj=null;
		//once above line is mentioned the object called no ref or null ref
		System.out.println(obj.name);
		System.out.println(obj.age);//NullpointerException will give in console
        
		NullReferenceConcept e = null;
		
		System.out.println(e.name);
		System.out.println(e.age);
		
		new NullReferenceConcept(); //this is ugliest thing to create object without giving ref name

	}

}
