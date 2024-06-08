package juneCodingAllProgram;

public class GreaterNumberInArray {

	public static void main(String[] args) {
		int arr[] = { 34, 545, 9999, 53, 353, 7676, 875, 34, 79, 45, 856, 3232, 6668, 3455, 26 };
		int max = Integer.MIN_VALUE;
		for (int num : arr) {
			if (max < num) {
				max = num;
			}
		}
		System.out.println(max);
	}
}
