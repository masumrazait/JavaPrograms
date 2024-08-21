package August20;

import java.util.HashMap;

public class DuplicateWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "masum raza delhi kolkata amnour masum raza";
		String[] word = input.split(" ");
		HashMap<String, Integer> wordCountMap = new HashMap<>();
		for (String words : word) {
			if (wordCountMap.containsKey(words)) {
				wordCountMap.put(words, wordCountMap.get(words) + 1);
			} else {
				wordCountMap.put(words, 1);
			}
		}
		System.out.println(wordCountMap);
	}
}
