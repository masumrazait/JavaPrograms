package practiceJavaCode;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqCharacter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the UserInput: ");
		String UserInput = sc.nextLine().toLowerCase();
		Set<Character> uniq = new HashSet<>();
		for (char c : UserInput.toCharArray())
			if (Character.isLetter(c)) {
				uniq.add(c);
			}
		System.out.println(uniq);
	}
}
