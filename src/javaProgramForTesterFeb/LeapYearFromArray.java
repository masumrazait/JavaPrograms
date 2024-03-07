package javaProgramForTesterFeb;

public class LeapYearFromArray {

	public static void main(String[] args) {
		int ar[] = { 1213, 3342, 4202, 2024, 2025, 2029, 2043, 2044, 2042, 2034, 3043, 3044, 4044 };
		for (int year : ar) {
			if ((year % 400 == 0) && (year % 100 != 0) || (year % 4 == 0)) {
				System.out.println(year + " year is leap year.");
			} else {
				System.out.println(year + " year is common year.");
			}
		}

	}

}
