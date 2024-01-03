package javaCodeForTester;

import java.util.Scanner;

public class ExtracOnlyNum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Alphanumeric: ");
		String UserInput = sc.nextLine();
		String Digital=(UserInput.replaceAll("[^0-9]", ""));
		System.out.println(Digital);
	}
}