package javaCodeForTester;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FindUniqLatter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String Userinput = sc.nextLine().toLowerCase();
		Set<Character> uniqCharecter = new HashSet<>();
		for (char c : Userinput.toCharArray()) {
			if (Character.isLetter(c))
				uniqCharecter.add(c);
		}
		System.out.println(uniqCharecter);
	}
}