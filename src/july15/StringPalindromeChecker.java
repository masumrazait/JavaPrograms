package july15;

public class StringPalindromeChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "jahaj";
		String orignal = input;
		String rev = "";
		int len = input.length();
		for (int i = len - 1; i >= 0; i--) {
			rev = rev + input.charAt(i);
		}
		if (orignal.equalsIgnoreCase(rev)) {
			System.out.println("String is palindrome: " + orignal);
		} else {
			System.out.println("String is not palidrome: " + rev);
		}
	}

}
