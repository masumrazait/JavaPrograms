package codeApril;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num = sc.nextInt();
		System.out.println("*****Table of " + num + "*****");
		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " * " + i + " = " + num * i);
		}
	}

}
