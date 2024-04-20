package coding_19;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateLatter {

	public static void main(String[] args) {
		String input = "masum";
		Set<Character> uniq = new HashSet<>();
		for (char c : input.toCharArray()) {
			if (Character.isLetter(c)) {
				uniq.add(c);
			}
		}
		System.out.println(uniq);
	}
}
