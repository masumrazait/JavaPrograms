package coding;

import java.util.Scanner;

public class ReveseString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the UserInput");
		String UserInput = sc.nextLine();
		int len = UserInput.length();
		String rev = "";
		String Original = UserInput;
		for (int i = len - 1; i >= 0; i--) {
			rev = rev + UserInput.charAt(i);
		}
		if (UserInput.equalsIgnoreCase(rev)) {
			System.out.println("string is palindorom :" + UserInput);
		} else {
			System.out.println("String is not palindrome: " + rev);
		}

	}

}
