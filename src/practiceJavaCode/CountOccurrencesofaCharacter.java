package practiceJavaCode;

import java.util.Scanner;

public class CountOccurrencesofaCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the user intput: ");
		String userInput = sc.nextLine();
		int original_Count = userInput.length();
		System.out.println("Original String is : " + userInput);
		String ReplaceString = userInput.replace("a", "");
		int replace_count = ReplaceString.length();
		System.out.println("Replace String is : " + ReplaceString);
		int c = original_Count - replace_count;
		System.out.println(c);

	}
}
