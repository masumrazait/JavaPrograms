package capgimini;

public class Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ar[] = { 12, 334, 6646, 75, 7676, 45, 34, 775, 8657, 86, 574 };
		int evencount = 0;
		int oddcount = 0;
		for (int num : ar) {
			if (num % 2 == 0) {
				evencount++;
				System.out.println("even number : " + num);
			} else {
				System.out.println("odd number : " + num);
				oddcount++;
			}
		}
		System.out.println("even count is : " + evencount);
		System.out.println("odd count is : " + oddcount);

	}

}
