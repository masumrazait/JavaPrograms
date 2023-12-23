package javaCodeForTester;

public class MinNumInArray {
	public static void main(String args[]) {
		int arr[] = { 12, 4, 64, 767, 343, 75, 878, 8 };
		int min = Integer.MAX_VALUE;
		for (int element : arr) {
			if (element < min) {
				min = element;
			}
		}
		System.out.println(min);
	}
}