package capgimini;

import java.util.HashSet;
import java.util.Set;

public class NonReaptingCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "abbcccdddd";
		Set<Character> uniq = new HashSet<>();
		for (char c : input.toCharArray()) {
			if (Character.isLetter(c)) {
				uniq.add(c);
			}
		}
		System.out.println(uniq);
	}
}
