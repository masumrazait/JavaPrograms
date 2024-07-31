package Aug1;

public class GreaterNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 12, 23, 2, 43, 53, 64, 67, 100, 78, 76, 65, 53, 32, 56, 77, 45, 75, 32, 5 };
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for (int ele : arr) {
			if (max < ele) {
				max = ele;
			}
			if (min > ele) {
				min = ele;
			}
		}
		System.out.println(max);
		System.out.println(min);
	}
}
