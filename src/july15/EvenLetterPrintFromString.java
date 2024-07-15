package july15;

import java.util.Scanner;

public class EvenLetterPrintFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Words: ");
		String input = sc.nextLine();
		for (int i = 1; i <= input.length() - 1; i += 2) {
			System.out.println(input.charAt(i));
		}
	}
}
