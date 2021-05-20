package OOP_InterfaceConcept;

public class TestHospital {

	public static void main(String[] args) {
		 ApolloHospital ap = new ApolloHospital();
		 ap.cardioServices();
		 ap.emergencyServices();
		 ap.gynecoServices();
		 
		 
		 ap.medicalInsurance();
		 ap.oncologyServices();
		 
		 USMedical.billing();
		 ap.taxCollection();
		 ap.resNDevlop();
		 ap.covidTest();
		
		
		 
		 //top casting : child class object is referred b parent interface  ref variables

		USMedical us= new ApolloHospital();
		us.orthoServices();
		us.neuroSrvices();
		us.emergencyServices();
		us.radioServices();
		System.out.println(USMedical.min_fee);
		//UsMedical.min_fee = 50;
		
		 FortisHospital fh = new FortisHospital();
		 fh.cardioServices();
		 fh.emergencyServices();
		 fh.gynecoServices();
		 fh.orthoServices();
		 USMedical.billing();
		 System.out.println(USMedical.min_fee);
		 fh.covidTest();
		 fh.resNDevlop();
		 
		 
	}

}
