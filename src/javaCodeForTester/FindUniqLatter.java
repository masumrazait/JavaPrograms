package javaCodeForTester;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FindUniqLatter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String UserInput = sc.nextLine().toLowerCase();
		Set<Character> uniq = new HashSet<>();
		for (char c : UserInput.toCharArray())
			if (Character.isLetter(c))
				uniq.add(c);
		System.out.println(uniq);
	}
}