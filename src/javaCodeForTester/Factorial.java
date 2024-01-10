package javaCodeForTester;

import java.util.Scanner;

public class Factorial {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number:");
		int num = sc.nextInt();
		long Factorial = 1;
		for (int i = 1; i <= num; i++) {
			Factorial = Factorial * i;
		}
		System.out.println(Factorial);
	}
}
