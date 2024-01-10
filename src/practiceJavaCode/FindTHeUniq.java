package practiceJavaCode;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FindTHeUniq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String userInput = sc.nextLine().toLowerCase();
		Set<Character> uniqCharacters = new HashSet<>();
		for (char c : userInput.toCharArray()) {
			if (Character.isLetter(c))
				uniqCharacters.add(c);
		}
		System.out.println(uniqCharacters);
	}
}
