package javaCodeForTester;

public class PrimeChecker {
	public static void main(String[] args) {
		int[] arr = { 25, 568, 584, 26, 45, 85 };
		for (int num : arr) {
			System.out.println(num + " is " + (isPrime(num) ? "Prime" : "Not Prime"));
		}
	}

	private static boolean isPrime(int num) {
		if (num <= 1)
			return false;
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}
}
