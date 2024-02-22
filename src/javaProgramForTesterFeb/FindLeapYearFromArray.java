package javaProgramForTesterFeb;

public class FindLeapYearFromArray {

	public static void main(String[] args) {
		int ar[] = { 2022, 2023, 2034, 2043, 4044, 5043, 5024, 5023, 2303, 2012, 2013, 2014, 2028, 2030, 2032, 2044 };
		int leapYearCount = 0;
		int commonYearCount = 0;
		for (int year : ar) {
			if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
				System.out.println("Leap year is :" + year);
				leapYearCount++;
			} else {
				System.out.println("Common year is :" + year);
				commonYearCount++;
			}
		}
		System.out.println("leap year count is : " + leapYearCount);
		System.out.println("leap year count is : " + commonYearCount);
	}

}
