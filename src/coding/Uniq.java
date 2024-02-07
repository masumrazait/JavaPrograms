package coding;

import java.util.HashSet;
import java.util.Set;

public class Uniq {

	public static void main(String[] args) {
		String latter = "Masum".toLowerCase();
		Set<Character> uniq = new HashSet<>();
		for (char c : latter.toCharArray())
			if (Character.isLetter(c)) {
				uniq.add(c);
			}
		System.out.println("Uniq Latter is : " + uniq);
	}
}
