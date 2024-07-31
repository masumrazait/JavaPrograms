package capgimini;

import java.util.HashMap;

public class CountOccurrences {
	public static void main(String[] args) {
		String str = "ABBCCCDDDDEEEEEFABC";
		HashMap<Character, Integer> countMap = new HashMap<>();

		for (char c : str.toCharArray()) {
			countMap.put(c, countMap.getOrDefault(c, 0) + 1);
		}

		System.out.println(countMap);
	}
}
