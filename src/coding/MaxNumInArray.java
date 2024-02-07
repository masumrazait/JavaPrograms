package coding;

public class MaxNumInArray {

	public static void main(String[] args) {
		int ar[] = { 1112, 113, 3, 65, 656, 76, 7, 35, 34, 765, 765, 8, 34, 54, 768, 76, 14, 189, 178, 78, 556, 4, 85 };

		// Greatest Number
		int max = Integer.MIN_VALUE;
		for (int num : ar) {
			if (num > max) {
				max = num;
			}
		}
		System.out.println("greatest num is : "+max);

		// Smallest Number
		int min = Integer.MAX_VALUE;
		for (int element : ar) {
			if (element < min) {
				min = element;
			}
		}
		System.out.println("smallest num is : "+min);
	}
}
