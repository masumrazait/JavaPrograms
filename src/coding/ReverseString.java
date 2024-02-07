package coding;

public class ReverseString {

	public static void main(String[] args) {
		String Name = "jahaj";
		String rev = "";
		int len = Name.length();
		for (int i = len - 1; i >= 0; i--) {
			rev = rev + Name.charAt(i);
		}
		if (Name.equalsIgnoreCase(rev)) {
			System.out.println(rev + " is palindrome");
		} else {
			System.out.println(rev + " is not palindrome");
		}
	}
}
