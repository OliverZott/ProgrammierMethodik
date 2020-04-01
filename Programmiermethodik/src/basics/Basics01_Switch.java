package basics;

public class Basics01_Switch {
	
	public static String getStringRepreentationOfGrades(int grade) {
		
		String gradeString = null;
				
		switch(grade) {
			case 5: {
				gradeString = "Nicht Genuegend";
				break;
			}
			case 4: {
				gradeString = "Genuegend";
				break;
			}
			case 3: {
				gradeString = "Befriedigend";
				break;
			}
			case 2: {
				gradeString = "Gut";
				break;
			}
			case 1: {
				gradeString = "Sehr gut";
				break;
			}
		}
		
		return gradeString;
	}
	
	
	// Main Method
	public static void main(String[] args) {

		System.out.println(getStringRepreentationOfGrades(3));
		
	}
}

		


	