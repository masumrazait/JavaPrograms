package practiceJavaCode;

public class OddEvenCount {
	public static void main(String Args[]) {
		int[] A = { 11, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 13, 14, 15, 16, 17, 19, 25, 29, 31, 55, 11, 51, 53 };
		int evenCount = 0;
		int oddCount = 0;
		for (int Num : A) {
			if (Num % 2 == 0) {
				evenCount++;
			} else {
				oddCount++;
			}
		}
		System.out.println(evenCount);
		System.out.println(oddCount);

	}

}