package javaCodeForTester;

import java.util.Scanner;

public class Factorial {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number:");
		int num = sc.nextInt();
		long factorial=1;
		for(int i=0;i<=num;i++) {
			factorial=factorial*i;
		}
		System.out.println(factorial);
	}
}
