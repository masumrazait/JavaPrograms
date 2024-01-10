package practiceJavaCode;

import java.util.Scanner;

public class InstanceVari {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		int rev = 0;
		int origianl = num;
		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		if (origianl == rev) {
			System.out.println("num is palindrome: " + origianl);
		} else {
			System.out.println("num is not the palindrome: " + rev);
		}

	}
}
