package NullAndGarbageTimeComplexity;

public class GarbageCollectorsConcept {
	
	String name;
	int age;

	public static void main(String[] args) {
		GarbageCollectorsConcept e1 =new GarbageCollectorsConcept();
		e1.name="Sejal";
		e1.age = 30;
		
		System.out.println(e1.name);
		
		
		 new GarbageCollectorsConcept();
		 new GarbageCollectorsConcept();//object created without reference name 
		 new GarbageCollectorsConcept();
		 new GarbageCollectorsConcept();
		 
		
		 GarbageCollectorsConcept e2 =new GarbageCollectorsConcept();
		 GarbageCollectorsConcept e3 =new GarbageCollectorsConcept();
		 
		 e2 = null;
		 e3 = null;
		 
		 
		 

	}

}
