package javaCodeForTester;

import java.util.Scanner;

public class IndexOfLaterPosion {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input string:");
		String inputString = sc.nextLine();
		System.out.println("Enter the sub string:");
		String subString = sc.nextLine();
		int index = inputString.indexOf(subString);
		System.out.println("Index of sub string is: " + index);
		}
		}