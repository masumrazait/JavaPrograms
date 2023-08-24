package practiceJavaCode;

import java.util.Scanner;

public class PalindromeNumberChecker {

	public static void main(String[] arg) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Wnter the number: ");

		int num = sc.nextInt();
		int rev = 0;
		int orign = num;
		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;

		}if(orign==rev) {
			System.out.println(orign+ "  num is palindrom");
			
		}else {
			System.out.println(orign+ "  num is not palindrom");
		}

	}
}
