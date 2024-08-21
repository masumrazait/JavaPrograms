package August20;

public class StringPalindromeChecker {

	public static void main(String[] args) {
		String str = "masum";
		String rev = "";
		String original = str;
		int len = str.length();
		for (int i = len - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		if (original.equalsIgnoreCase(rev)) {
			System.out.println("string is palindrome " + original);
		} else {
			System.out.println("String is not a palindrome: " + rev);
		}
	}
}
