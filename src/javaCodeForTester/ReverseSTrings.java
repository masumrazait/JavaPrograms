package javaCodeForTester;

public class ReverseSTrings {

	public static void main(String[] args) {
		String input = "Masum";
		String rev = "";
		int len = input.length();
		for (int i = len - 1; i >= 0; i--) {
			rev = rev + input.charAt(i);
		}
		System.out.println(rev);
	}
}
