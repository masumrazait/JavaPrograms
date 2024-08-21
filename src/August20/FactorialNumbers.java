package August20;

public class FactorialNumbers {

	public static void main(String[] args) {
		long factorial = 1;
		int num = 5;
		for (int i = 1; i <= num; i++) {
			factorial = factorial * i;
		}
		System.out.println("The Factorial of " + num + " is " + factorial);
	}
}
