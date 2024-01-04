package javaCodeForTester;

import java.util.Scanner;

public class FibonnacciSeries {

	public static void main(String[] args) {
		int n1 = 0, n2 = 1, sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int userinput = sc.nextInt();
		System.out.println(n1 + "   " + n2);
		for (int i = 2; i <= userinput; i++) {
			sum = n2 + n1;
			n1 = n2;
			n2 = sum;
			System.out.println("seriese is:"+sum);
		}
	}
}