package javaProgramForTesterFeb;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqLetter {

	public static void main(String[] args) {
		Scanner st = new Scanner(System.in);
		System.out.println("Enter the Inputdata: ");
		String input = st.nextLine().toLowerCase();
		Set<Character> uniq = new HashSet<>();
		for (char c : input.toCharArray())
			if (Character.isLetter(c)) {
				uniq.add(c);
			}
		System.out.println(uniq);
	}
}
