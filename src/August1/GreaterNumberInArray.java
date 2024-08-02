package August1;

public class GreaterNumberInArray {

	public static void main(String[] args) {
		int arr[] = { 12, 34, 56, 616, 626, 32, 53, 21, 312, 46, 61 };
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for (int num : arr) {
			if (max < num) {
				max = num;
			}
			if (min > num) {
				min = num;
			}
		}
		System.out.println(max + " numbers");
		System.out.println(min + " numbers");

	}
}
