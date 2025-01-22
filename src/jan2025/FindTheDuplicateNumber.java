package jan2025;

import java.util.HashSet;
import java.util.Set;

public class FindTheDuplicateNumber {
	public static void main(String[] args) {
		int arr[] = { 11, 22, 33, 44, 55, 66, 77, 88, 99, 11, 55, 66, 77 };
		Set<Integer> duplicate = new HashSet<>();
		Set<Integer> uniq = new HashSet<>();
		for (int num : arr) {
			if (!uniq.add(num)) {
				duplicate.add(num);
			}
		}
		System.out.println("duplicate num is : " + duplicate);
		System.out.println("uniq num is : " + uniq);
	}
}
