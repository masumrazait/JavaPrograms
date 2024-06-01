package june1;

public class ReversString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "masum";
		int len = str.length();
		String rev = "";
		String original = str;
		for (int i = len - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		if (original.equalsIgnoreCase(rev)) {
			System.out.println(original + " is palindrome");
		} else {
			System.out.println(rev + " not is palindrome");
		}
	}

}
