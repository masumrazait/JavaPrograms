package javaCodeForTester;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FindUniqLatter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter hte String :");
		String inputString = sc.nextLine();
		Set<Character> uniqueLetters = new HashSet<>();
		for (char c : inputString.toCharArray())
			if (Character.isLetter(c))
				uniqueLetters.add(c);
		System.out.println("Unique letters: " + uniqueLetters);
	}
}
