package javaCodeForTester;

public class MinNumInArray {
	public static void main(String args[]) {
		int arr[] = { 111, 2, 33, 4, 55, 6, 22, 57, 11, 56, 756, 878, 10 };
		int min = Integer.MAX_VALUE;
		for (int element : arr) {
			if (element < min) {
				min = element;
			}
		}
		System.out.println(min);
	}
}