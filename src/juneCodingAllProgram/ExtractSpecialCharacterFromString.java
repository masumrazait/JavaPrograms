package juneCodingAllProgram;

import java.util.Scanner;

public class ExtractSpecialCharacterFromString {

	public static void main(String[] args) {
		Scanner sd = new Scanner(System.in);
		System.out.println("Enter the String with regular expression: ");
		String str = sd.nextLine();
		String remove = str.replaceAll("[^A-Z a-z]", "");
		System.out.println("After removingSpecialCHaracter: " + remove);
	}
}
