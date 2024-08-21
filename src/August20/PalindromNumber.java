package August20;

public class PalindromNumber {

	public static void main(String[] args) {
		int num = 12321;
		int rev = 0;
		int orignal = num;
		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		if (orignal == rev) {
			System.out.println("num is palindrome: " + orignal);
		} else {
			System.out.println("num is noot palindrome: " + rev);
		}
	}
}
