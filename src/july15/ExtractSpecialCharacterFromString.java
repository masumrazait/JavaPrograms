package july15;

import java.util.Scanner;

public class ExtractSpecialCharacterFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Word with Special Characters: ");
		String input = sc.nextLine();
		String rm = input.replaceAll("[^a-zA-Z]", "");
		System.out.println("After replacing the Spacial Character is: " + rm);
	}
}
