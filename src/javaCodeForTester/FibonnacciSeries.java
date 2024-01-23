package javaCodeForTester;

import java.util.Scanner;

public class FibonnacciSeries {

	public static void main(String[] args) {
		int n1 = 0, n2 = 1, sum;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		System.out.println(n1 + " " + n2);
		for (int i = 2; i <= num; i++) {
			sum = n1 + n2;
			n2 = n1;
			n1 = sum;
			System.out.println(sum);
		}
	}
}