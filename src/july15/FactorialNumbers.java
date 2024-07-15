package july15;

public class FactorialNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 9;
		long factorial = 1;
		for (int i = 1; i <= num; i++) {
			factorial = factorial * i;
		}
		System.out.println("The Factorial of " + num + " is " + factorial);
	}
}
