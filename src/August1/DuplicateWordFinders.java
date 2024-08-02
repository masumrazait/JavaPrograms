package August1;

import java.util.HashSet;
import java.util.Set;

public class DuplicateWordFinders {

	public static void main(String[] args) {
		String str = "masum,raza,delhi,masum,raza";
		String[] word = str.split(",");
		Set<String> uniqWord = new HashSet<>();
		for (String words : word) {
			uniqWord.add(words.trim());
		}
		for (String words : uniqWord) {
			System.out.println(words);
		}
	}

}
