package javaCodeForTester;

import java.util.Scanner;

public class CompareTwoStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First String: ");
		String FirstString = sc.nextLine();
		System.out.println("Enter the Second String: ");
		String SecondString = sc.nextLine();
		if (FirstString.equalsIgnoreCase(SecondString)) {
			System.out.println("String is equal");
		}else {
			System.out.println("String is not Equal");
		}
	}
}
