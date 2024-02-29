package practiceJavaCode;

import java.util.Scanner;

public class CountOccurrencesofaCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String original = sc.nextLine().toLowerCase();
		int originalCount = original.length();
		System.out.println("Original String and String count:" + original + ":" + originalCount);
		String replaceStr = original.replace("a", "");
		int replaceCount = replaceStr.length();
		System.out.println("Original String and String count:" + replaceStr + ":" + replaceCount);
		int CountOccurrencesofaCharacter = originalCount - replaceCount;
		System.out.println("CountOccurrencesofaCharacter : " + CountOccurrencesofaCharacter);
	}
}
