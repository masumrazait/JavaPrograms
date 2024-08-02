package August1;

import java.util.HashSet;
import java.util.Set;

public class DuplicateWordFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "my,name,is,masum,raza,masum";
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
