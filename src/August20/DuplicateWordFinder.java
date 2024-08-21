package August20;

import java.util.HashSet;
import java.util.Set;

public class DuplicateWordFinder {

	public static void main(String[] args) {
		String input = "masum raza tata audi mercides tata masum";
		String[] word = input.split(" ");
		Set<String> uniq = new HashSet<>();
		for (String words : word) {
			uniq.add(words.trim());
		}
		for (String words : uniq) {
			System.out.println("uniq word is : " + words);
		}
	}
}
