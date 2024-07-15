package july15;

public class GreaterNumberInArray {

	public static void main(String[] args) {
		int ar[] = { 1, 2, 4, 6, 8, 2, 33, 3345, 55 };
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for (int num : ar) {
			if (max < num) {
				max = num;
			}
		}

		for (int element : ar) {
			if (min > element) {
				min = element;
			}
		}
		System.out.println("greater number is : " + max);
		System.out.println("smallest number is : " + min);
	}
}
