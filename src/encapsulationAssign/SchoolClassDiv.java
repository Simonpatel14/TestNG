package encapsulationAssign;

public class SchoolClassDiv {
	
	private String stdName;
	private String field;
	private int stdRollNo;
	private int stdId;
	
	
	
	public SchoolClassDiv(String stdName, String field, int stdRollNo, int stdId) {
		super();
		this.stdName = stdName;
		this.field = field;
		this.stdRollNo = stdRollNo;
		this.stdId = stdId;
	}
	
	public SchoolClassDiv(String stdName, String field) {
		this.stdName = stdName;
		this.field = field;
	}



	public String getStdName() {
		return stdName;
	}



	public String getField() {
		return field;
	}



	public int getStdRollNo() {
		return stdRollNo;
	}



	public int getStdId() {
		return stdId;
	}
	
	
	
	
	
	

}
