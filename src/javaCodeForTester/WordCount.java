package javaCodeForTester;

import java.util.Scanner;

public class WordCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Sentence : ");
		String UserInput = sc.nextLine().toLowerCase();
		int count = 1;
		for (int i = 0; i < UserInput.length() - 1; i++) {
			if ((UserInput.charAt(i) == ' ') && (UserInput.charAt(i + 1) != ' ')) {
				count++;
			}
		}
		System.out.println(count);
	}
}