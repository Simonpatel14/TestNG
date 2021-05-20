package OOp_InheritanceAssign;

public class TestUniversity {
	public static void main (String[] args) {
		
		System.out.println("-------CambridgeCollege------------------");
		CambridgeColleges cam = new CambridgeColleges();
		cam.basicRules();
		cam.licence();
		cam.structure();
		cam.admissionRule();
		cam.noOfStaff();
		cam.termHolidays();
		
		System.out.println("--------------NottinghamCollege------------------");
        NottinghamCollege nth = new NottinghamCollege();
        nth.basicRules();
        nth.licence();
        nth.faculty();
        nth.sizeOfClass();
        nth.structure();
        
        
   		System.out.println("--------------OxfordCollege------------------");
		OxfordCollege oxf = new OxfordCollege();
		oxf.licence();
		oxf.basicRules();
		oxf.structure();
		oxf.courses();
		oxf.sizeOfClass();
		
		System.out.println("------------Top Casting--------------");
		UniversityGroup uni =  new OxfordCollege();
		uni.basicRules();
		uni.structure();
		uni.licence();
		uni.sizeOfClass();
		
		System.out.println("-----------------Top Casting--------------");
		UniversityGroup uni1 =  new NottinghamCollege();;
		uni.basicRules();
		uni.structure();
		uni.licence();
		uni.sizeOfClass();
		
		CentralUniversity cen = new CambridgeColleges();
		cen.licence();
		
        //downcasting 
		CambridgeColleges c = (CambridgeColleges) new UniversityGroup();//ClassCastException
		
	}

	
	
	
	
	
	
	
}
