package javaCodeForTester;

import java.util.Scanner;

public class IndexOfLaterPosion {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the any word:");
		String UserInput = sc.nextLine().toLowerCase();
		System.out.println("Enter the Letter to find the Index Position: ");
		String substring = sc.nextLine().toLowerCase();
		int Index = UserInput.indexOf(substring);
		System.out.println(substring + " - index position is :" + Index);
	}
}