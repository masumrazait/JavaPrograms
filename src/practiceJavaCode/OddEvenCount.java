package practiceJavaCode;

public class OddEvenCount {
	public static void main(String Args[]) {
		int[] A = { 1, 2, 3, 4, 5, 6, 7, 8, 910 };

		int oddCount = 0;
		int evenCount = 0;
		for (int num : A)
			if (num % 2 == 0) {
				oddCount++;
			} else {
				evenCount++;
			}
		System.out.println("Total count :"+ oddCount);
		System.out.println("Total count :"+ evenCount);
	}

}