package javaCodeForTester;

import java.util.Scanner;

public class NoRepeatedCharecter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the UserInput: ");
		String UserInput = sc.nextLine().toLowerCase();
		for (char c : UserInput.toCharArray()) {
			if (UserInput.indexOf(c) == UserInput.lastIndexOf(c)) {
				System.out.println("first non repeated letter: " + c);
			}
		}
	}
}
