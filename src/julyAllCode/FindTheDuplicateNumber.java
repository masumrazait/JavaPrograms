package julyAllCode;

import java.util.HashSet;
import java.util.Set;

import javax.tools.Diagnostic;

public class FindTheDuplicateNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[] = { 53, 53, 757, 854, 2343, 64, 75, 567, 335432, 7547657, 42, 1, 1 };
		Set<Integer> dupIntege = new HashSet<>();
		Set<Integer> uniq = new HashSet<>();
		for (int num : ar) {
			if (!uniq.add(num))
				dupIntege.add(num);
		}
		System.out.println(dupIntege);
	}

}
