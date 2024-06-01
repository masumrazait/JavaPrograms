package lastMay24;

import java.util.HashSet;
import java.util.Set;

public class DuplicateWordFinder {
	public static void main(String[] args) {
		String str = "masum,masum,razza,rani";
		String[] words = str.split(",");
		Set<String> uniqueWords = new HashSet<>();

		for (String word : words) {
			uniqueWords.add(word.trim());
		}

		System.out.print("Unique words:");
		for (String word : uniqueWords) {
			System.out.print(word + ",");
		}
	}
}