package javaProgramForTesterFeb;

import java.util.Scanner;

public class NonRepeatedLetters {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Input: ");
		String input = sc.nextLine().toLowerCase();
		for (char c : input.toCharArray()) {
			if (input.indexOf(c) == (input.lastIndexOf(c))) {
				System.out.println("non repeated letter is : " + c);
			}
		}

	}

}
