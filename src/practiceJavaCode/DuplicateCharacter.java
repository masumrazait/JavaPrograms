package practiceJavaCode;

import java.util.Scanner;

public class DuplicateCharacter {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Duplicate StringCharacter:");
		String DuplicateCharecrter = sc.nextLine();
		String original = removeDuplicateCharecrter(DuplicateCharecrter);
		System.out.println("String with duplicates removed:" + original);

	}

	public static String removeDuplicateCharecrter(String str) {
		StringBuilder original = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			char currentChar = str.charAt(i);
			if (str.indexOf(currentChar) == i) {
				original.append(currentChar);
			}
		}
		return original.toString();
	}
}
