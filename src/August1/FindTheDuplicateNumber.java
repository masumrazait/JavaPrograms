package August1;

import java.util.HashSet;
import java.util.Set;

public class FindTheDuplicateNumber {

	public static void main(String[] args) {
		int arr[] = { 12, 34, 56, 66, 66, 32, 53, 21, 32, 46, 61 };
		Set<Integer> uniqNum = new HashSet<>();
		Set<Integer> duplicate = new HashSet<>();
		for (int num : arr) {
			if (!uniqNum.add(num)) {
				duplicate.add(num);
			}
		}
		System.out.println(duplicate);
	}
}
