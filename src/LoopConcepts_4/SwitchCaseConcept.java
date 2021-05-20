package LoopConcepts_4;

public class SwitchCaseConcept {

	public static void main(String[] args) {
		   String day = "6";
		  
		   switch (day) {
		case "1":
			System.out.println("Day " + day +" is "  + "Monday");
			break;
		case "2":
			System.out.println("Day " + day +" is "  + "Tuesday");
			break;
		case "3":
			System.out.println("Day " + day +" is "  + "Wednesday");
			break;
		case "4":
			System.out.println("Day " + day +" is "  + "Thursday");
			break;
		case "5":
			System.out.println("Day " + day +" is "  + "Friday");
			break;
		case "6":
			System.out.println("Day " + day +" is "  + "Saturday");
			break;
		case "7":
			System.out.println("Day " + day +" is "  + "Sunday");
			break;
		default:
			System.out.println("Not on the list");
			break;
		}
			
		String country = "France";
		String capital ="null";
		
		switch (country) {
		case "India":
			capital = "New Delhi";
			break;
		case "Switzerland":
			capital = "Bern";
			break;
		case "Germany":
			capital = "Berlin";
			break;
		case "United Kingdom":
			capital = "London";
			break;

		default:
			System.out.println( country  +  "Not found in the List");
			break;
		}
		System.out.println("Country is : " + country +  "  capital is : "  + capital);
		
		
		
		int marks = 30;
		String grade = null;
		
		switch (marks) {
		case 100:
			grade ="Grade A";
			break;
		case 80:
			grade ="Grade B";
			break;
		case 50:
			grade ="Grade C";
			break;
		case 30:
			grade ="Fail";
			break;
		default:
			System.out.println("Grade not found");
			break;
		}
		
		System.out.println("Marks " + marks  + " grade is : "  + grade); 
		
		
	

	}

}
