package juneCodingAllProgram;

import java.util.HashSet;
import java.util.Set;

public class DuplicateNumberFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[] = { 22, 34, 35, 656, 7576, 43, 563, 634, 345, 345, 355, 355, 221, 121, 11, 11 };
		Set<Integer> uniq = new HashSet<>();
		Set<Integer> duplicat = new HashSet<>();
		for (int num : ar) {
			if (!uniq.add(num)) {
				duplicat.add(num);
			}
		}
		System.out.println("duplicate num is : " + duplicat);
	}

}
