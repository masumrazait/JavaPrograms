package javaCodeForTester;

public class MaxNumInArray {

	public static void main(String[] args) {
		int[] arr = { 10, 55, 43, 63, 31, 743, 11, 23, 45 };
		int max = Integer.MIN_VALUE;
		for (int element : arr) {
			if (element > max) {
				max = element;
			}
		}
		System.out.println("max element is " + max);
	}
}
