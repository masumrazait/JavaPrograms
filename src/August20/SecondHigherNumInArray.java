package August20;

public class SecondHigherNumInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 32, 43, 54, 756, 854, 343, 645, 888, 999, 757, 342, 767, 431, 135, 74, 86 };
		int first = Integer.MIN_VALUE;
		int second = Integer.MAX_VALUE;
		for (int num : arr) {
			if (num > first) {
				second = first;
				first = num;
			} else if (num > second && num != first) {
				num = second;
			}
		}
		System.out.println("2nd hight num : " + second);
	}
}
