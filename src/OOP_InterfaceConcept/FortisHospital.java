package OOP_InterfaceConcept;

public class FortisHospital extends Medical implements USMedical,UKMedical,IndiaMedical {

	@Override
	public void orthoServices() {
		System.out.println("FH - orthoServices");
		
	}

	@Override
	public void neuroSrvices() {
		System.out.println("FH - neuroServices");

	}

	@Override
	public void emergencyServices() {
		System.out.println("FH - emergencyServices");
	
	}

	@Override
	public void radioServices() {
		System.out.println("FH - radioServices");
	
		
	}

	@Override
	public void cardioServices() {
		System.out.println("FH - cardioServices");
		
	}

	@Override
	public void oncologyServices() {
		System.out.println("FH - oncologyServices");
		
	}

	@Override
	public void physioServices() {
		System.out.println("FH - physioServices");
		
	}

	@Override
	public void gynecoServices() {
		System.out.println("FH - radioServices");
		
	}
	
	//non overridden method
	public void medicalInsurance() {
	System.out.println("FH - medicalInsurance");
	}
	
	public void pathalogyServices() {
		System.out.println("FH -pathalogyServices");
		}
    @Override
	public void taxCollection() {
		System.out.println("FH -- 20% taxCollection");
	}

	@Override
	public void covidTest() {
		System.out.println("FH - covidTest");
		
	}
}

