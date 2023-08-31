package practiceJavaCode;

import java.util.Scanner;

public class InstanceVari {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		long num = sc.nextLong();

		long rev = 0;
		long original = num;

		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		if (original == rev) {
			System.out.println(original + "number is palindrom");
		}else {
			System.out.println(original+ "  num is not palindrom");
		}

	}
}
