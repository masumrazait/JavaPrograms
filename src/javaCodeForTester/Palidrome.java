package javaCodeForTester;

import java.util.Scanner;

public class Palidrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Digit: ");
		int num = sc.nextInt();
		int rev = 0;
		int original = num;
		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		if (original == rev) {
			System.out.println("number is palindrom: " + original);
		} else {
			System.out.println("number is not a palindrom : " + rev);
		}
	}

}
