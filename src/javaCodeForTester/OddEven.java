package javaCodeForTester;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num = sc.nextInt();
		if (num % 2!= 0) {
			System.out.println("Number is Odd");
		} else {
			System.out.println("Number is even");
		}

	}

}
