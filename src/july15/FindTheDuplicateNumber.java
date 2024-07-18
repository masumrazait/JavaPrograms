package july15;

import java.util.HashSet;
import java.util.Set;

public class FindTheDuplicateNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[] = { 12333, 2, 134, 53554, 747, 445, 43634, 7457, 8566, 346, 636, 636, 367, 36434, 643654, 8586, 235 };
		String input = "India Delhi".toLowerCase();
		Set<Integer> duplicate = new HashSet<>();
		Set<Integer> uniq = new HashSet<>();
		for (int num : ar) {
			if (!uniq.add(num)) {
				duplicate.add(num);
			}
		}
		System.out.println("duplicate number is : " + duplicate);

		Set<Character> uniqs = new HashSet<>();
		Set<Character> duplicates = new HashSet<>();
		for (char c : input.toCharArray()) {
			if (!uniqs.add(c)) {
				duplicates.add(c);
			}
		}
		System.out.println("duplicate charater is : " + duplicates);
	}
}
