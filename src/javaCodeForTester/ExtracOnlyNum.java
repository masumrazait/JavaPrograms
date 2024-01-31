package javaCodeForTester;

import java.util.Scanner;

public class ExtracOnlyNum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Alphanumeric: ");
		String userInput=sc.nextLine();
		String digit=userInput.toUpperCase();
		System.out.println(digit);
	}
}