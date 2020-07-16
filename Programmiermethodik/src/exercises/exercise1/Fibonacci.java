package exercises.exercise1;

/**
 * PS Programmiermethodik - Exercise 1
 * 
 * @author Oliver Zott
 *
 */
public class Fibonacci {
	
	
	/** Calculate fibonacci numbers iterative 
	 * 
	 * @param number
	 * @return
	 */
	public static int fib(int number) {
		int first = 0;
		int second = 1;
		int result = 0;
		
		int i = 1;
		while(i < number) {
			result = first + second;
			first = second;
			second = result;
			i++;
		}
		return result;
	}
	
	public static int testForExercise() {
		int test = 6 * 5 / 3;
		int test2 = 1 << 8 % 3;
		int test3 = (short) Integer.MAX_VALUE;  // overflow
		int test4 = 1 == 24 % 3 ? 4 : 7;
		return test4;
	}
	
	public static void main(String[] args) {
		System.out.println(fib(10));
		System.out.println(testForExercise());
	}

}
