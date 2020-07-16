package exercises.exercise1;

public class ArrowPrinter {

	public static void printArrow(char character, int maxLength, int stepSize) {
		int stepNumber = numberOfSteps(maxLength, stepSize);
		
		printAscendingArrow(character, stepNumber, stepSize);
		printDescendingArrow(character, stepNumber, stepSize);
	}
	
	private static int numberOfSteps(int maxLength, int stepSize) {
		int result = (int) maxLength / stepSize;
		return  result;
	}
	
	private static void printAscendingArrow(char character, int steps, int stepSize) {
		
		for (int i = 1; i <= steps; i++) {
			printSymbolLine(character, i*stepSize);
		}
	}
	
	private static void printDescendingArrow(char character, int steps, int stepSize) {
		
		for (int i = steps; i > 0; i--) {
			printSymbolLine(character, i*stepSize);
		}
	}
	
	private static void printSymbolLine(char character, int steps) { 
		for (int i = 0; i < steps; i++) {
			System.out.print(character);
		}
		System.out.println();
	}
}
