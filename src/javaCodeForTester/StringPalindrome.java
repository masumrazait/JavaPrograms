package javaCodeForTester;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :");
		String UserInput = sc.nextLine();
		String Orignal = UserInput;
		String rev = "";
		int len = UserInput.length();
		for (int i = len - 1; i >= 0; i--) {
			rev = rev + UserInput.charAt(i);

		}
		if (Orignal.equalsIgnoreCase(rev)) {
			System.out.println(rev + " String is Palindrom.");
		} else
			System.out.println(rev + " String is not Palindrom.");
	}
}
