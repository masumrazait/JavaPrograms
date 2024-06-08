package juneCodingAllProgram;

public class SmallestNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 23, 25, 6, 2, 64, 7577, 35, 65, 3452, 567658, 34634, 7476, 43, 64456, 56756, 5656756, 225, 52 };
		int min = Integer.MAX_VALUE;
		for (int num : arr) {
			if (min > num) {
				min = num;
			}
		}
		System.out.println(min);
	}

}
