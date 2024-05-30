package coding_19;

import java.util.Scanner;

public class Voowel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word: ");
		String input = sc.nextLine();
		int count = 0;
		String vowel = "aeiouAEIOU";
		for (char c : input.toCharArray()) {
			if (vowel.indexOf(c) != -1) {
				count++;
				System.out.println("Vowle letter is :" + c);
				System.out.println(count);
			}
		}
	}
}
