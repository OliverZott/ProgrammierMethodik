package exercises.exercise1;

import exercises.exercise1.ArrowPrinter;;

public class FunWithLoops {
	
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		
		ArrowPrinter arrowPrinter = new ArrowPrinter();
		arrowPrinter.printArrow('-', 43, 5);
		
		ArrowPrinter.printArrow('*', 10, 1);
	}

}
