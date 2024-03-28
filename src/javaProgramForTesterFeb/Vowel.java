package javaProgramForTesterFeb;

import java.util.Scanner;

public class Vowel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the words: ");
		String input = sc.nextLine();
		String vowel = "AEIOUaeiou";
		for (char c : input.toCharArray()) {
			if (vowel.charAt(c) != 1) {
				System.out.println(c);
			}
			// System.out.println(c);
		}
	}

}
