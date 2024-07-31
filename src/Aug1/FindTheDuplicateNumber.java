package Aug1;

import java.util.HashSet;
import java.util.Set;

public class FindTheDuplicateNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 12, 23, 1, 43, 53, 64, 67, 78, 76, 65, 53, 32, 56, 77, 45, 75, 32, 1 };
		Set<Integer> uniq = new HashSet<>();
		Set<Integer> duplicate = new HashSet<>();
		for (int num : arr) {
			if (!uniq.add(num)) {
				duplicate.add(num);
			}
		}
		System.out.println(duplicate);
	}
}
