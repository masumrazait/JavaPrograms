package javaCodeForTester;

public class SecondHighestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 15, 33, 71, 55, 34, 64, 75, 82,9999, 131, 345, 6464, 7563, 34 };
		int f = arr[0];
		int s = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > f) {
				s = f;
				f = arr[i];
			} else if (arr[i] > s) {
				s = arr[i];
			}
		}
		System.out.println(s);
	}

}
