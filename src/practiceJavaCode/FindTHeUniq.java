package practiceJavaCode;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FindTHeUniq {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String userinput = sc.nextLine().toLowerCase();
		Set<Character> uniqcharecter = new HashSet<>();
		for (char c : userinput.toCharArray())
			if (Character.isLetter(c)) {
				uniqcharecter.add(c);
			}
		System.out.println(uniqcharecter);
	}
}