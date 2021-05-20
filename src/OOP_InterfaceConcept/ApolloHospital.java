package OOP_InterfaceConcept;

public class ApolloHospital extends Medical implements USMedical, UKMedical,IndiaMedical {

	@Override
	public void orthoServices() {
		System.out.println("APo - orthoServices");
		
	}

	@Override
	public void neuroSrvices() {
		System.out.println("APo - neuroServices");

	}

	@Override
	public void emergencyServices() {
		System.out.println("APo - emergencyServices");
	
	}

	@Override
	public void radioServices() {
		System.out.println("APo - radioServices");
	
		
	}

	@Override
	public void cardioServices() {
		System.out.println("APo - cardioServices");
		
	}

	@Override
	public void oncologyServices() {
		System.out.println("APo - oncologyServices");
		
	}

	@Override
	public void physioServices() {
		System.out.println("APo - physioServices");
		
	}

	@Override
	public void gynecoServices() {
		System.out.println("APo - radioServices");
		
	}
	
	//non overridden method
	public void medicalInsurance() {
	System.out.println("APo - medicalInsurance");
	}
	
	public void pathalogyServices() {
		System.out.println("APo -pathalogyServices");
		}
    @Override
	public void taxCollection() {
		System.out.println("Apo -- 20% taxCollection");
	}

	@Override
	public void covidTest() {
		System.out.println("Apo - covidTest");
		
	}
}
