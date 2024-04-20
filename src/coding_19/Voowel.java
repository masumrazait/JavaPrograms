package coding_19;

import java.util.Scanner;

public class Voowel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word: ");
		String input = sc.nextLine();
		String vowel = "aeiouAEIOU";
		for (char c : input.toCharArray()) {
			if (vowel.indexOf(c) != -1) {
				System.out.println("Vowle letter is :" + c);
			}
		}
	}
}
