package August1;

public class PalindromNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1234321;
		int rev = 0;
		int origi = num;
		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		if (origi == rev) {
			System.out.println(origi + " num is palindrome");
		} else {
			System.out.println(rev + " num is not palindrome");
		}
	}

}
