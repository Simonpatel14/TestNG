package encapsulationAssign;

public class SchoolTest {

	public static void main(String[] args) {
		
		SchoolClassDiv sch = new SchoolClassDiv ("Hazel","Science",45,8888);
		System.out.println(sch.getStdId());
		System.out.println(sch.getField());
		System.out.println(sch.getStdRollNo());
		System.out.println(sch.getStdName());
		
		System.out.println("---------------------------------------------");
		SchoolClassDiv sch1 = new SchoolClassDiv ("Oscar","IT",89,7777);
        System.out.println(sch1.getStdName() +" " +sch1.getField() + " "+ sch1.getStdId() + " "+sch1.getStdRollNo() );
        
        System.out.println("---------------------------------------------");
        SchoolClassDiv sch3 = new SchoolClassDiv ("Plam ","Medical");
		System.out.println(sch3.getStdName());
		System.out.println(sch3.getField());
        
        
	}

}
