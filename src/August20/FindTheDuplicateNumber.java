package August20;

import java.util.HashSet;
import java.util.Set;

public class FindTheDuplicateNumber {

	public static void main(String[] args) {
		String str = "masumraza";
		int[] arr = { 13, 45, 66, 77, 445, 34, 66, 453, 646, 34, 54, 656, 45, 33, 64, 53, 23, 35 };
		Set<Character> uniq = new HashSet<>();
		Set<Character> duplicate = new HashSet<>();
		Set<Integer> uniqNum = new HashSet<>();
		Set<Integer> duplicatenum = new HashSet<>();
		for (int num : arr) {
			if (!uniqNum.add(num)) {
				duplicatenum.add(num);
			}
		}
		for (char c : str.toCharArray()) {
			if (!uniq.add(c)) {
				duplicate.add(c);
			}
		}
		System.out.println("duplicate num is : " + duplicatenum);
		System.out.println("duplicate character is : " + uniq);
	}
}
