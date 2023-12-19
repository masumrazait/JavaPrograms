package javaCodeForTester;

import java.util.Scanner;

public class MaxNun {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number first number:");
		int n1=sc.nextInt();
		System.out.println("Enter the number first number:");
		int n2=sc.nextInt();
		int c=Math.max(n1, n2);
		System.out.println("greater nuumberr is : "+c);
	}
}