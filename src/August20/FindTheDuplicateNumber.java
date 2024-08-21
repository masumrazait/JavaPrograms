package August20;

import java.util.HashSet;
import java.util.Set;

public class FindTheDuplicateNumber {

	public static void main(String[] args) {
		int arr[] = { 12, 34, 566, 743, 342, 234, 54346, 63, 343, 23, 564, 223, 32, 55, 55, 233, 233, 2355, 234, 342,
				2332, 233, 2334, 335, 55 };
		Set<Integer> uniq = new HashSet<>();
		Set<Integer> duplicate = new HashSet<>();
		for (int num : arr) {
			if (!uniq.add(num)) {
				duplicate.add(num);
			}
		}
		System.out.println(duplicate);
		System.out.println(uniq);
	}

}
