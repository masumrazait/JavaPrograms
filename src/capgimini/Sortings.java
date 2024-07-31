package capgimini;

import java.util.Arrays;

public class Sortings {

	public static void main(String[] args) {
		int arr[] = { 34, 13, 9, 33, 57, 83, 2, 7, 8, 943, 45, 88, 4 };
		int brr[] = { 1, 36, 78, 84, 0, 66, 88, 3 };
		int combined[] = new int[arr.length + brr.length];
		System.arraycopy(arr, 0, combined, 0, arr.length);
		System.arraycopy(brr, 0, combined, arr.length, brr.length);
		Arrays.sort(combined);
		System.out.println(Arrays.toString(combined));
	}
}
