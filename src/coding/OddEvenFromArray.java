package coding;

public class OddEvenFromArray {

	public static void main(String[] args) {
		int ar[] = { 11, 2, 34, 45, 43, 54, 70, 8, 80, 90, 80, 70, 60, 50, 40, 30, 20, 10, 12, 32, 100 };
		for (int num : ar) {
			if (num % 2 == 0) {
				System.out.println("number is even: " + num);
			} else {
				System.out.println("nuber is odd: " + num);
			}
		}
	}
}