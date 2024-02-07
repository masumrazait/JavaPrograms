package coding;

public class NumberPalindrome {

	public static void main(String[] args) {
		int num = 12321;
		int rev = 0;
		int orgn = num;
		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		if (orgn == rev) {
			System.out.println(orgn + " num is palindrome");
		} else {
			System.out.println(rev + " num is not palindrome");
		}
	}

}
