package August20;

public class GreaterNumberInArray {

	public static void main(String[] args) {
		int arr[] = { 12, 5000, 34, 566, 743, 342, 234, 233, 233, 2, 233, 2334, 335, 55 };
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for (int num : arr) {
			if (max < num) {
				max = num;
			}
			if (min > num) {
				min = num;
			}
		}
		System.out.println(min);
		System.out.println(max);
	}
}
