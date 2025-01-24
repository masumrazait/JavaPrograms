package jan2025;

public class GreaterNumberInArray {

	public static void main(String[] args) {
		int arr[] = { 11, 22, 33, 33, 44, 56, 7, 8, 9, 99, 434 };
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for (int num : arr) {
			if (max < num) {
				max = num;
			}
		}
		for (int ele : arr) {
			if (min > ele) {
				min = ele;
			}
		}
		System.out.println("greater number is : " + max);
		System.out.println("greater number is : " + min);
	}
}
