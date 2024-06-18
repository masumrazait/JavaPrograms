package june11;

import java.util.HashSet;
import java.util.Set;

public class ExtractSpecialCharacterFromString {

	public static void main(String[] args) {
		String str = "raza";
		Set<Character> uniq = new HashSet<>();
		for (char c : str.toCharArray()) {
			if (Character.isLetter(c)) {
				uniq.add(c);
			}
		}
		System.out.println(uniq);
	}

}
