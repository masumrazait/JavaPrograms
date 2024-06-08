package juneCodingAllProgram;

public class OddAndEvenFromArray {

	public static void main(String[] args) {
		int arr[] = { 34, 545, 9999, 53, 353, 7676, 875, 34, 79, 45, 856, 3232, 6668, 3455, 26 };
		int evencount = 0;
		int oddcount = 0;
		for (int num : arr) {
			if (num % 2 == 0) {
				evencount++;
				System.out.println("number is even " + num);
			} else {
				oddcount++;
				System.out.println("number is odd " + num);
			}
		}
		System.out.println("Total even number coount is : " + evencount);
		System.out.println("Total odd number coount is : " + oddcount);
	}
}
