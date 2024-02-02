package coding;

import java.util.Scanner;

public class CheckYearLeapOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the year : ");
		int year = sc.nextInt();
		if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
			System.out.println(year + " is a leap years");
		} else {
			System.out.println(year + " is a common years");
		}
	}
}
