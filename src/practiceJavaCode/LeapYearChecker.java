package practiceJavaCode;

import java.util.Scanner;

public class LeapYearChecker {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The Year:");
		int year = scanner.nextInt();
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			System.out.println("Year is LeapYear");
		} else {
			System.out.println("not a leap year:");
		}
	}
}