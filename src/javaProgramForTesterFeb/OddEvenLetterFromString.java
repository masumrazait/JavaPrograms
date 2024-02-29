package javaProgramForTesterFeb;

import java.util.Scanner;

public class OddEvenLetterFromString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String st = sc.nextLine();
		for (int i = 1; i < st.length(); i += 2) {
			System.out.println(st.charAt(i));
		}
	}
}
