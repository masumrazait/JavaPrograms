package javaProgramForTesterFeb;

import java.util.HashSet;
import java.util.Set;

public class UniqLetterFromString {

	public static void main(String[] args) {
		String name = "masum".toLowerCase();
		Set<Character> uniq = new HashSet<>();
		for (char c : name.toCharArray())
			if (Character.isLetter(c)) {
				uniq.add(c);
			}
		System.out.println("uniq letter is : " + uniq);
	}
}
