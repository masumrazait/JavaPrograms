package javaCodeForTester;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FindUniqLatter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String userInString = sc.nextLine().toLowerCase();
		Set<Character> uniqCharacters = new HashSet<>();
		for (char c : userInString.toCharArray())
			if (Character.isLetter(c))
				uniqCharacters.add(c);
		System.out.println(uniqCharacters);
	}
}