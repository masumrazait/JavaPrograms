package javaProgramForTesterFeb;

public class GreaterNumberAndSmallerNumber {

	public static void main(String[] args) {
		int ar[] = { 12, 34, 566, 7, 8, 22, 4534, 9999, 2432, 53, 5, 646, 235, 642, 355, 3245, 32, 1, 54 };
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for (int element : ar) {
			if (max < element) {
				max = element;
			}
		}
		for (int mins : ar) {
			if (min > mins) {
				min = mins;
			}
		}
		System.out.println("greater number is : " + max);
		System.out.println("lowest number is : " + min);
	}
}
