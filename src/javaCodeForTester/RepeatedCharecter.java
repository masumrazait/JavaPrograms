package javaCodeForTester;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RepeatedCharecter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String inputString = sc.nextLine().toLowerCase();

		Map<Character, Integer> charCountMap = new HashMap<>();
		// Count occurrences of each character in the string
		for (char c : inputString.toCharArray()) {
			charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
		}
		// Print repeated characters
		System.out.println("Repeated characters in the string:");
		for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey() + " = " + entry.getValue() + " times");
			}
		}
	}
}
