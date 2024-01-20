package javaCodeForTester;

import java.util.Scanner;

public class NamePrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the UserInput: ");
		String UserInput = sc.nextLine().toLowerCase();
		String rev = "";
		int len = UserInput.length();
		for (int i = len - 1; i >= 0; i--) {
			rev = rev + UserInput.charAt(i);
		}
		System.out.println(rev);
	}
}