package july15;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 1213;
		int rev = 0;
		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		System.out.println("reverse num is : " + rev);
	}
}
