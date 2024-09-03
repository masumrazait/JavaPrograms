package August20;

public class SecondHighestNum {

	public static void main(String[] args) {
		int arr[] = { 11, 22, 33, 44, 55, 66, 77, 88, 99 };
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		for (int num : arr) {
			if (num > first) {
				second = first;
				first = num;
			} else if (num > second && num != first) {
				second = num;
			}
		}
		System.out.println(second);
	}
}
