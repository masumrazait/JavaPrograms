package juneCodingAllProgram;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateCharacter {

	public static void main(String[] args) {
		String str = "masum";
		Set<Character> uniq = new HashSet<>();
		for (char c : str.toCharArray()) {
			if (Character.isLetter(c)) {
				uniq.add(c);
			}
		}
		System.out.println("Remove duplicate character is : "+uniq);
	}

}
