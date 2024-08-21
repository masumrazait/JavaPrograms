package August20;

public class LeapYearNonLeapYearInArray {

	public static void main(String[] args) {
		int arr[] = { 1200, 3400, 4346, 63, 343, 23, 564, 223, 32, 55, 55, 233, 233, 2355, 234, 342 };
		for (int year : arr) {
			if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
				System.out.println("leap years : " + year);
			} else {
				System.out.println("non leap year : " + year);
			}
		}
	}
}
