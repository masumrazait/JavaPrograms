package javaCodeForTester;

import java.util.Scanner;

public class CompareTwoStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First String: ");
		String FirstString = sc.nextLine().toLowerCase();
		System.out.println("Enter the Second String: ");
		String SecondString = sc.nextLine().toLowerCase();
		if(FirstString.equals(SecondString)) {
			System.out.println("First String is Equal to Second String");
		}else {
			System.out.println("First String is not Equal to Second String");
		}
	}
}
