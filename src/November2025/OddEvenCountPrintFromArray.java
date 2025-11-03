package November2025;

public class OddEvenCountPrintFromArray {
	public static void main(String[] args) {
		int[] arr = { 11, 22, 333, 44, 55, 66, 77, 88, 22, 33, 2 };
		int evenCount = 0, oddCount = 0;
		System.out.print("Even numbers: ");
		for (int num : arr) {
			if (num % 2 == 0) {
				System.out.print(num + " ");
				evenCount++;
			}
		}

		System.out.println("\nEven count: " + evenCount);
		System.out.print("Odd numbers: ");
		for (int num : arr) {
			if (num % 2 != 0) {
				System.out.print(num + " ");
				oddCount++;
			}
		}
		System.out.println("\nOdd count: " + oddCount);
	}
}
