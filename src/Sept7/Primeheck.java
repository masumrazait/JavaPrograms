package Sept7;

public class Primeheck {

	public static void main(String[] args) {
		int prime = 0;
		for (int num = 1; num <= 100; num++) {
			if (isPrime(num)) {
				System.out.println(num + " num is prime");
				prime++;
			} else {
				System.out.println(num + " not prime");
			}
		}
		System.out.println("total prime num count:" + prime);
	}

	private static boolean isPrime(int num) {
		if (num < 1)
			return false;
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}
}
