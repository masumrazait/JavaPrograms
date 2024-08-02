package August1;

public class StringPalindromeChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "jahaj";
		String origi = str;
		String rev = "";
		int len = str.length();
		for (int i = len - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		if (origi.equalsIgnoreCase(rev)) {
			System.out.println(origi + " string is palindrome");
		} else {
			System.out.println(rev + " string is non palindrome");
		}
	}
}
