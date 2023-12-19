package javaCodeForTester;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word:");
		String userInput = sc.nextLine();
		/*
		 * StringBuilder rev=new StringBuilder(userInput); rev.reverse();
		 * System.out.println(rev);
		 */
		String rev = "";
		int len = userInput.length();
		for (int i = len - 1; i >= 0; i--) {
			rev = rev + userInput.charAt(i);
		}
		System.out.println(rev);
	}
}
