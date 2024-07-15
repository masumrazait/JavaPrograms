package july15;

public class LeapYearNonLeapYearInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[] = { 2022, 2015, 2016, 2014, 2024, 2030, 2028 };
		for (int year : ar) {
			if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
				System.out.println(year + " is leap year");
			} else {
				System.out.println(year + " is non leap year");
			}
		}
	}
}
