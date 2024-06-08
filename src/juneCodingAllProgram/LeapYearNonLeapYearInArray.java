package juneCodingAllProgram;

public class LeapYearNonLeapYearInArray {

	public static void main(String[] args) {
		int yearAll[] = { 2302, 2202, 2022, 2011, 2012, 2032, 2033, 2304, 2018, 2026, 3034, 2024 };
		for (int year : yearAll) {
			if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
				System.out.println("leap years: " + year);
			} else {
				System.out.println("non-leap years: " + year);
			}
		}
	}
}
